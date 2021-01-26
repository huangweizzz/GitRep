package com.springcloud.study.enties;

// 代理角色:中介
public class Proxy implements  Rent {

    //把房东拉进来
    private Host host;

    //构造方法
    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        fare();
    }


    //看房
    public void seeHouse() {
        System.out.println("带房客看房");
    }

    //收中介费
    public void fare() {
        System.out.println("收中介费");

    }
}