package com.springcloud.study.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.study.enties.Dept;
import com.springcloud.study.service.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class DeptController {

    @Autowired
    private DeptServiceImpl deptService;
    @HystrixCommand(fallbackMethod = "hystrixGet" )
    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptService.queryById(id);
        if(dept == null){
            throw  new RuntimeException("id===>" + id+ "不存在该用户,或者信息无法找到");
        }
        return  dept;
    }

    //备选方法:熔断版
    public Dept hystrixGet(@PathVariable("id") Long id){
        return  new Dept().setDeptNo(id).setDeptName("id===>" + id+",没有对应的信息").setDbSource("没有这个数据库");
    }

}
