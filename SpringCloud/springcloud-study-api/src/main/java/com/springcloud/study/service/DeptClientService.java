package com.springcloud.study.service;

import com.springcloud.study.enties.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * 说明:这里的接口映射的是提供者controller层的方法
 */
@FeignClient(value = "springcloud-provider-dept",fallbackFactory = DeptClientServiceFallbackFactory.class) //找到对应的微服务提供者
public interface DeptClientService {

    @GetMapping("/dept/get/{id}")
    Dept queryById(@PathVariable("id") Long id);

    @GetMapping("/dept/list")
    List<Dept> queryAll();

    @PostMapping("/dept/list")
    boolean addDept(Dept dept);
}
