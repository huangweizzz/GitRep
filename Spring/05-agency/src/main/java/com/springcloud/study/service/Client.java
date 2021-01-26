package com.springcloud.study.service;

public class Client {

    public static void main(String[] args) {
        //真实业务
        UserServiceImpl userServiceimpl = new UserServiceImpl();
        //代理类
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        //使用代理类来实现日志功能
        userServiceProxy.setUserService(userServiceimpl);
        userServiceProxy.add();

    }
}
