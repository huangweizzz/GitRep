package com.springcloud.study.service;

import com.springcloud.study.enties.Dept;

import java.util.List;

public interface DeptService {

    boolean addDept(Dept dept);

    Dept queryById(Long id);

    List<Dept> queryAll();

}
