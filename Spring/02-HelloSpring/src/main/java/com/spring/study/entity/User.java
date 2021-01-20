package com.spring.study.entity;

import lombok.Data;

@Data
public class User {

    private  String name;

    public User(){
    }

    public void setName(String name1) {
       // System.out.println("set方法接受到的参数name1为:" + name1);
        this.name = name1;
    }

    public void show(){
        System.out.println("name的值为:" + name);
    }
}
