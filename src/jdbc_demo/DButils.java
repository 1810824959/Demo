package jdbc_demo;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

public class DButils {
    QueryRunner rs = new QueryRunner(C3P0Utils.getDatasource());
    @Test
    public void test(){
        try {
            List<User> list = rs.query("select * from User", new BeanListHandler<User>(User.class));
            for(User user:list){
                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
