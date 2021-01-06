package com.ssm.test;

import com.ssm.beans.Account;
import com.ssm.dao.AccountDao;
import com.ssm.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {


    //测试spring框架已经创建
    @org.junit.Test
    public void test1(){
        ApplicationContext ac  = new ClassPathXmlApplicationContext("classpath:applicationContext");
        AccountService accountService = ac.getBean("accountService",AccountService.class);
        System.out.println(accountService); //com.ssm.service.impl.AccountServiceImpl@527e5409 spring框架搭建完成
    }

    //测试mybatis框架搭建
    @org.junit.Test
    public void test2() throws IOException {
        InputStream ins = Resources.getResourceAsStream("mybatis-config");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(ins);
        SqlSession session = build.openSession();
        AccountDao accountDao = session.getMapper(AccountDao.class);
        List<Account> accounts = accountDao.findAll();
        for (Account account:accounts) {
            System.out.println(account.getName());
        }
    }

    //测试spring整合mybatis
    @org.junit.Test
    public void test3(){
        ApplicationContext ac  = new ClassPathXmlApplicationContext("classpath:applicationContext");
        AccountDao dao = ac.getBean(AccountDao.class);
        System.out.println(dao);//org.apache.ibatis.binding.MapperProxy@6a2b953e


    }
}
