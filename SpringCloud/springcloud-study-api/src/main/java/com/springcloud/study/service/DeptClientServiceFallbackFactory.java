package com.springcloud.study.service;

import com.springcloud.study.enties.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

//降级(把Service关闭,直接提供接口的实现类内容)
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {

    //一个方法提供熔断,这里提供一个类的熔断
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            public Dept queryById(Long id) {
                return new Dept().setDeptNo(id).setDeptName("id===>"+id+",没有对应的信息,客户端提供了降级的信息,这个服务已经被关闭").setDbSource("没有数据");
            }

            public List<Dept> queryAll() {
                return null;
            }

            public boolean addDept(Dept dept) {
                return false;
            }
        };
    }
}
