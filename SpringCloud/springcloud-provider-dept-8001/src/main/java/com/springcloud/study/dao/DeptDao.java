package com.springcloud.study.dao;

import com.springcloud.study.enties.Dept;
import org.apache.ibatis.annotations.Mapper;

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
     * 根据id查找
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
