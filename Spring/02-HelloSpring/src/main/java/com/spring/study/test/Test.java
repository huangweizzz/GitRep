package com.spring.study.test;

import com.spring.study.entity.Student;
import com.spring.study.entity.User;
import com.spring.study.entity.UserT;
import com.spring.study.impl.UserServiceImpl;
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

    @org.junit.Test
    public void test2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("SpringApplication.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl)ac.getBean("ServiceImpl");
        userServiceImpl.getUser();
    }


    @org.junit.Test
    public void test3(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("SpringApplication.xml");
        User user = (User)ac.getBean("user");
        user.show();
    }

    @org.junit.Test
    public void test4(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("SpringApplication.xml");
        UserT userT = (UserT)ac.getBean("TUser");
        userT.show();
    }

    @org.junit.Test
    public void test5(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("SpringApplication.xml");
        UserT userT = (UserT)ac.getBean("UserNew");
        userT.show();
    }

    @org.junit.Test
    public void test6(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("SpringApplication.xml");
        User user = (User)ac.getBean("hello2");
        user.show();
    }



}
