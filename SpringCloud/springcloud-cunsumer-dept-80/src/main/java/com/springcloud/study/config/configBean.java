package com.springcloud.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration //原先是从spring的xml注册bean,现在可以用配置类 -- spring applicationContext.xml
public class configBean {

    @Bean
    public RestTemplate getRestTemplate(){

        return new RestTemplate();
    }
}
