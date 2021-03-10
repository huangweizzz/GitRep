package com.springcloud.study.enties;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Accessors(chain = true) //链式写法
public class Dept implements Serializable {

    private Long deptNo;//主键

    private String deptName;//部门名称

    private String dbSource;//来自哪个数据库,因为微服务架构可以是一个服务对应一个数据库,同一个信息被存储到不同数据库


//    public static void main(String[] args) {
//        Dept dept = new Dept();
//        //链式写法
//        dept.setDeptNo(1L).setDName("ls").setDb_source("DB001");
//    }

}
