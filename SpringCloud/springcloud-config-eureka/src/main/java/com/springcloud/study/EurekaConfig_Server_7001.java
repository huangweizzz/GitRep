package com.springcloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer //服务端的启动类,可以接受别人注册进来
@SpringBootApplication
public class EurekaConfig_Server_7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConfig_Server_7001.class,args);
    }
}
