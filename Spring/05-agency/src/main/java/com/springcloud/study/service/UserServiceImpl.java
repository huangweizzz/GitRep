package com.springcloud.study.service;

public class UserServiceImpl implements  UserService{


    @Override
    public void add() {
        System.out.println("增加了角色!");
    }

    @Override
    public void delete() {
        System.out.println("删除了角色!");
    }

    @Override
    public void update() {
        System.out.println("修改了角色!");
    }

    @Override
    public void query() {
        System.out.println("查询角色");

    }
}
