package com.liyang.dao.impl;

import com.liyang.dao.UserDao;
import com.liyang.domain.User;

import org.apache.commons.dbutils.QueryRunner;

import javax.activation.DataSource;


public class UserDaoImpl extends UserDao {
    @Override
    public void AddUser(User user) throws Exception {
        QueryRunner runner = new QueryRunner();

    }
}
