package com.Dao;

import com.domain.Account;

public interface AccountDao {

    public void updateAccount(Account account) throws Exception;

    public void insertAccount() throws Exception;

    public Account AccountFindByName(String name) throws Exception;

}
