package com.springcloud.study.dao;

import com.springcloud.enties.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper //告诉Spring容器是dao层,等同于在springboot的主启动类加上@MapperScan
public interface DeptDao {

    /**
     * 增加一个部门
     * @param dept
     * @return
     */
    boolean addDept(Dept dept);

    /**
     * 根据id查询部门信息
     * @param id
     * @return
     */
    Dept queryById(Long id);


    /**
     * 查询所有部门
     * @return
     */
    List<Dept> queryAll();
}
