package com.ssm.dao;


import com.ssm.beans.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

//spring整合mybatis后交给spring整理
@Repository("accountDao")
public interface AccountDao {
    /**
     * 保存账户
     * @param account
     */
    void saveAccount(Account account);


    /**
     * 查询账户
     * @return
     */
    //@Select("select * from account")
     List<Account>  findAll();
}
