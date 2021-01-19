package com.spring.study.test;

import com.spring.study.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{

    @org.junit.Test
    public void test01(){
        //解析beans.xml文件,生成管理相应的Bean对象
        ApplicationContext  ac = new ClassPathXmlApplicationContext("SpringApplication.xml");
        //getBean:数即为spring配置文件中bean的id
        Student student = (Student) ac.getBean("hello");
        System.out.println("从Spring容器中获取到的对象：" + student);
        student.show();
    }
}
