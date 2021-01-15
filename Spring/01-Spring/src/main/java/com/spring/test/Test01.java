package com.spring.test;

import com.spring.mapper.UserDaoImpl;
import com.spring.mapper.UserDaoOracleImpl;
import com.spring.mapper.UserService;
import com.spring.mapper.UserServiceImpl;
import org.junit.Test;

public class Test01 {


    /**
     * 测试每次新加需求都增加实现类来完成耦合度很高
     */
    @Test
    public void test01(){
        UserService userService = new UserServiceImpl();
        userService.getUserService();
    }

    /**
     * 与上面发生了根本性变化,上面都是程序去创建
     * 下面是对象是有我们创建,主动权调给了创建者
     * 程序员不再管理对象的创建,更多的关注业务的实现,也大大降低了耦合度
     */
    @Test
    public void test02(){
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        userServiceImpl.setUserDao(new UserDaoImpl());
        //使用Oracle去实现呢
        userServiceImpl.setUserDao(new UserDaoOracleImpl());
    }


}
