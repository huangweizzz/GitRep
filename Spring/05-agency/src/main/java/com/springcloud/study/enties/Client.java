package com.springcloud.study.enties;

//客户类: 一般客户都去找代理即中介
public class Client {
    public static void main(String[] args) {
        //房东来了
        Host host = new Host();
        //中介帮助房东出租房租
        Proxy proxy = new Proxy(host);
        //你去找中介
        proxy.rent();

    }
}
