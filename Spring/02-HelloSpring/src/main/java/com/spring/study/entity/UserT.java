package com.spring.study.entity;


public class UserT {

    private String username;

    private Integer age;

    public UserT(String username){
        System.out.println("有参构造方接受到的参数为:" + username );
        this.username = username;
    }

    public void setName(String username) {
        this.username = username;
    }

    public void show(){
        System.out.println("name的值为:" + username);
    }
}
