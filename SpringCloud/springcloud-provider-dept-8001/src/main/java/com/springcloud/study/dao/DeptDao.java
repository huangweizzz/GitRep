package com.springcloud.study.dao;

import com.springcloud.enties.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper //加上此注解可以减少mapper.xml注解的配置,一般在方法上配合@Select
@Repository //交给spring处理
public interface DeptDao {

    boolean addDept(Dept dept);

    Dept queryById(Long id);

    List<Dept> queryAll();
}
