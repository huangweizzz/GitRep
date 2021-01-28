package com.springcloud.study.service;

import com.springcloud.enties.Dept;
import com.springcloud.study.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {


    @Autowired
    private DeptDao deptDao;


    public boolean addDept(Dept dept) {

        return deptDao.addDept(dept);
    }

    public Dept queryById(Long id) {

        return deptDao.queryById(id);
    }

    public List<Dept> queryAll() {

        return deptDao.queryAll();
    }
}
