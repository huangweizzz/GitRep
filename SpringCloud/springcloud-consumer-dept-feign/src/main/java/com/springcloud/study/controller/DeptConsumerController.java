package com.springcloud.study.controller;

import com.springcloud.study.enties.Dept;
import com.springcloud.study.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptConsumerController {

    @Autowired
    private DeptClientService service;

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){

        return service.queryById(id);
    }

    @PostMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return service.addDept(dept);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){

        return service.queryAll();
    }
}
