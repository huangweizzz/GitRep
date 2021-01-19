package com.springcloud.study.controller;

import com.springcloud.enties.Dept;
import com.springcloud.study.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //提供restful接口
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/dept/add")
    public boolean addDept( Dept dept){

        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept queryDept(@PathVariable("id") Long id){

        return deptService.queryById(id);
    }

    @GetMapping ("/dept/list")
    public List<Dept> queryAll(){

        return deptService.queryAll();
    }

}
