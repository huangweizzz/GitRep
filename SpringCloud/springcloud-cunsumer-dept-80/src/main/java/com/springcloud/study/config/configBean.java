package com.springcloud.study.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration //原先是从spring的xml注册bean,现在可以用配置类 -- spring applicationContext.xml
public class configBean {

    //配置负载均衡实现RestTemplate
    //开启负载均衡
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


    /**
     * 自定义的ribbon策略配置不能放在@ComponentScan所扫描的当前包下以及子包下，
     * 否则我们自定义的这个配置类就会被所有的Ribbon客户端所共享。通过查看源代码来看，启动类一般加@SpringBootApplication，
     * 而它底封装了@ComponentScan注解，所以自定义的代码文件不能和启动类放在同一个包下
     */
//    @Bean
//    public IRule myRule(){
//
//        return new RandomRule(); //随机
//    }


}
