package com.spring.study.test;

import com.spring.study.mapper.UserDaoImpl;
import com.spring.study.mapper.UserDaoOracleImpl;
import com.spring.study.mapper.UserServiceImpl;

public class Test {

    @org.junit.Test
    public void test01() {
        UserServiceImpl userServiceimpl = new UserServiceImpl();
        //使用oracle时
        //userServiceimpl.setUserDao(new UserDaoOracleImpl());
        //普通使用时
        userServiceimpl.setUserDao(new UserDaoImpl());
        userServiceimpl.getUser();
    }
}