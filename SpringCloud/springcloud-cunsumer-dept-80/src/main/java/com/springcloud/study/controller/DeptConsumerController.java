package com.springcloud.study.controller;

import com.springcloud.study.enties.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {
    //理解:消费者.不应该有service层
    //RestTemplate 我们直接调用
    //{url,实体: Map ,Class<T> responseType返回值类型}
    @Autowired
    private RestTemplate restTemplate; //提供多种便捷访问http服务的方法,简单的Restful服务模板



    //private static final String REST_URL_PREFIX="http://localhost:8001";
    //通过ribbon,我们这里的地址应该是一个变量,通过服务来访问
    private static final String REST_URL_PREFIX = "http://springcloud-provider-dept";

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){

        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }
}
