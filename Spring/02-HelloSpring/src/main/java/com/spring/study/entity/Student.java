package com.spring.study.entity;

import lombok.Data;

@Data
public class Student {

    private String name;

    public void show(){
        System.out.println("hello:" + name);
    }
}
