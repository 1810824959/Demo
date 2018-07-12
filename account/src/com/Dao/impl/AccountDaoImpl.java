package com.Dao.impl;

import com.Dao.AccountDao;
import com.Dao.C3P0Utils;
import com.mchange.v2.c3p0.impl.C3P0ImplUtils;
import org.apache.commons.dbutils.QueryRunner;

public class AccountDaoImpl implements AccountDao{
    public static void transfer(){
        QueryRunner rs =new QueryRunner(C3P0Utils.getDatasource());

    }
}
