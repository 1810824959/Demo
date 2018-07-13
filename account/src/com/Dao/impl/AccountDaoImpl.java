package com.Dao.impl;

import com.Dao.AccountDao;
import com.domain.Account;
import com.utils.C3P0Utils;
import com.utils.ManageThreadLacal;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class AccountDaoImpl implements AccountDao{
    @Override
    public void insertAccount() throws Exception {
        QueryRunner qr = new QueryRunner();
        qr.update(ManageThreadLacal.getConnection(),"insert into account (name,money) VALUES ('haha',500)");
    }

    @Override
    public void updateAccount(Account account){
        QueryRunner qr = new QueryRunner();
        try {
            qr.update(ManageThreadLacal.getConnection(),"update account set money=? where name=?",account.getMoney(),account.getName());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Account AccountFindByName(String name) throws Exception {
        QueryRunner qr = new QueryRunner();
        return qr.query(ManageThreadLacal.getConnection(),"select * from account where name=?", new BeanHandler<Account>(Account.class),name);
    }
}
