package com.utils;

import java.sql.Connection;
import java.sql.SQLException;

public class ManageThreadLacal {
    private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();

    public static Connection getConnection(){
        Connection conn = tl.get();
        if(conn==null){
            conn=C3P0Utils.getConnection();
            tl.set(conn);
        }
        return conn;
    }

    public static void start(){
        Connection conn = getConnection();
        try {
            conn.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void commit(){
        Connection conn = getConnection();
        try {
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void rollback(){
        Connection conn = getConnection();
        try {
            conn.rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void close(){
        Connection conn = getConnection();
        try {
            conn.close();
            tl.remove();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
