package com.springcloud.study.enties;


import javax.annotation.Resource;

public class User {

    @Resource(name = "cat1")
    private  Cat1 cat1;
    @Resource
    private  Dog dog;
    private  String str;

    public Cat1 getCat() {
        return cat1;
    }

    public Dog getDog() {
        return dog;
    }

    public String getStr() {
        return str;
    }
}
