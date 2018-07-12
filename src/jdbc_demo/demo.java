package jdbc_demo;

import java.sql.*;

public class demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//        不推荐

        Class.forName("com.mysql.jdbc.Driver");
        String user="1810824959";
        String pwd="a19970211";
        int i=0;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qq_spider", user, pwd);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM shuoshuo");
            while (i<10){
                rs.next();
                System.out.println(rs.getObject(2));
                i++;
            }
            rs.close();
            stmt.close();
            conn.close();
            /*
            while (rs.next()){
                System.out.println(rs.getObject(2));
            }*/         // rs.next()返回的是 boolean

        } catch (SQLException e) {
            e.printStackTrace();
        }



    }

}
