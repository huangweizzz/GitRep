package com.springcloud.study.controller;

import com.springcloud.enties.Dept;
import com.springcloud.study.dao.DeptDao;
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


    @Autowired
    private DeptDao deptDao;

    //获得一些配置信息,得到具体的微服务
    @Autowired
    private DiscoveryClient client;

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept) {
        return deptService.addDept(dept);
    }


    //如果是feign调用直接调用dao通俗易懂
    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable(value = "id") Long id){
        System.out.println("方法执行到这里");
        return deptDao.queryById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }

    //注册进来的微服务获取一些信息
    @RequestMapping("/dept/discovery")
    public Object discovery() {
        //获取微服务列表的清单
        List<String> services = client.getServices();
        System.out.println("discovery=>:" + services);
        //得到一个具体的微服务信息,通过具体的微服务id,applicationName
        List<ServiceInstance> instances = client.getInstances("springcloud-provider-dept");
        for (ServiceInstance instance:instances) {
            System.out.println("服务的相关信息:" + instance.getHost() + "," + instance.getPort() + "," + instance.getUri() + "," + instance.getServiceId());
        }
        return this.client;

    }

}
