package com.spring.study.test;

import com.spring.study.enties.Student;
import com.spring.study.enties.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("SpringApplication.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println("name的值为:" + student.getName());
    }

    @org.junit.Test
    public void test02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("SpringApplication.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println("name和address的值为:" + student.getName() + "," + student.getAddress());
    }

    @org.junit.Test
    public void test03(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("SpringApplication.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println("name和address的值为:" + student.getName() + "," + student.getAddress() + ",books为:" + student.getBooks());
    }

    @org.junit.Test
    public void test04(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("SpringApplication.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println("hobby的值为:" + student.getHobbys());
    }

    @org.junit.Test
    public void test05(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("SpringApplication.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println("card的值为:" + student.getGames());
    }

//    @org.junit.Test
//    public void test06(){
//        ApplicationContext ac = new ClassPathXmlApplicationContext("SpringApplication.xml");
//        Student student = (Student) ac.getBean("student");
//        System.out.println("card的值为:" + student.getWife());
//    }

//    @org.junit.Test
//    public void test07(){
//        ApplicationContext ac = new ClassPathXmlApplicationContext("SpringApplication.xml");
//        Student student = (Student) ac.getBean("student");
//        System.out.println("card的值为:" + student.getInfo());
//    }


    @org.junit.Test
    public void test08(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("SpringApplication.xml");
        User user = (User) ac.getBean("user");
        System.out.println("name和age的值为:" + user.getName() + "," + user.getAge());
    }

    @org.junit.Test
    public void test7(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("SpringApplication.xml");
        User user1 = (User)ac.getBean("user");
        User user2 = (User)ac.getBean("user");
        System.out.println(user1 == user2);
    }
}
