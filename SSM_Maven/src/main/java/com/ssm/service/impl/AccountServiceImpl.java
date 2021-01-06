package com.ssm.service.impl;

import com.ssm.beans.Account;
import com.ssm.dao.AccountDao;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {


    @Autowired
    private AccountDao accountDao;

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public List<Account> findAll() {
        List<Account> accounts = accountDao.findAll();
        System.out.println("service层");
        return accounts;
    }
}
