package com.ssm.service;

import com.ssm.beans.Account;

import java.util.List;

public interface AccountService {
    /**
     * 保存账户
     * @param account
     */
    public void saveAccount(Account account);


    /**
     * 查询账户
     * @return
     */
    public List<Account> findAll();

}
