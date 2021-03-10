package com.springcloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard //开启监控
public class DeptConsumerDashboard_9991 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashboard_9991.class,args);
    }
}
