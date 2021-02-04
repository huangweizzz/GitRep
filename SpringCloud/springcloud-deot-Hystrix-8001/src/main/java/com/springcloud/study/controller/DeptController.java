package com.springcloud.study.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.enties.Dept;
import com.springcloud.study.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //提供restful接口
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public Dept get(@PathVariable(value = "id") Long id){
        Dept dept = deptService.queryById(id);
        if(dept == null){
            throw new RuntimeException("这个id不存在!--->" + id);
        }
        return  dept;
    }

    //备选方案(浏览器会出现我们预定的语句,如果不加浏览器会显示异常)
    public Dept hystrixGet(@PathVariable(value = "id") Long id){
        return new Dept().setDeptNo(id).setDeptName("id不存在!--->Hystrix").setDbSource("没有这个数据库");
    }

}
