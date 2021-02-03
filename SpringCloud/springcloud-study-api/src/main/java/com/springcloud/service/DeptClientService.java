package com.springcloud.service;

import com.springcloud.enties.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * 说明:接口这里的地址指向的是controller,访问的方法时controller中的方法
 */
@FeignClient(value = "springcloud-provider-dept") //找到对应的微服务提供者
public interface DeptClientService {

    @GetMapping("/dept/get/{id}")
    Dept queryById(@PathVariable("id") Long id);

    @GetMapping("/dept/list")
    List<Dept> queryAll();

    @PostMapping("/dept/list")
    boolean addDept(Dept dept);
}
