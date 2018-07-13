package com.test;

import com.Dao.AccountDao;
import com.Dao.impl.AccountDaoImpl;
import com.service.transfer;
import org.junit.Test;
import com.service.impl.transferImpl;

public class TestService {

    @Test
    public void test_1(){
        transfer tf = new transferImpl();
        tf.transfer("haha","jack",150);
    }

    @Test
    public void test_2(){
        AccountDao ad = new AccountDaoImpl();
        try {
            ad.insertAccount();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
