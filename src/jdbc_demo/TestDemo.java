package jdbc_demo;

import org.apache.commons.dbutils.QueryRunner;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class TestDemo {

    @Test
    public void add(){
        Connection conn = C3P0Utils.getConnection();

        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO user (name,pwd,email) VALUES ('tom','123','111')");
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
        }

        System.out.println(conn.getClass().getName());

    }

}
