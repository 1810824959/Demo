package com.service.impl;

import com.Dao.AccountDao;
import com.Dao.impl.AccountDaoImpl;
import com.domain.Account;
import com.service.transfer;
import com.utils.ManageThreadLacal;

public class transferImpl implements transfer {
    @Override
    public void transfer(String FromName, String ToName, double Money) {
        AccountDao ad = new AccountDaoImpl();
        try {
            ManageThreadLacal.start();

            Account from = ad.AccountFindByName(FromName);
            Account to = ad.AccountFindByName(ToName);

            from.setMoney(from.getMoney()-Money);
            to.setMoney(to.getMoney()+Money);

            ad.updateAccount(from);
            ad.updateAccount(to);

            ManageThreadLacal.commit();

        } catch (Exception e) {
            ManageThreadLacal.rollback();
            e.printStackTrace();
        }finally {
            ManageThreadLacal.close();
        }

    };
}

