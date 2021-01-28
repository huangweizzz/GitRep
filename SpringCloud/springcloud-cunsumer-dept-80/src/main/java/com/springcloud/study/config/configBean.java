package com.springcloud.study.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration //原先是从spring的xml注册bean,现在可以用配置类 -- spring applicationContext.xml
public class configBean {

    @Bean
    //配置负载均衡实现RestTemplate
    @LoadBalanced //Ribbon
    public RestTemplate getRestTemplate(){

        return new RestTemplate();
    }


}
