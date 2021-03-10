package com.springcloud.study;

import com.springcloud.study.myrule.EgoRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

//ribbon和eureka整合以后,客户端可以直接调用,不用关系ip地址和端口号
@SpringBootApplication
@EnableEurekaClient
//在微服务启动的时候,能够加载我们自定义Ribbon类 name 微服务名称
@RibbonClient (name = "springcloud-provider-dept",configuration = EgoRule.class)
public class DeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class,args);
    }
}
