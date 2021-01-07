package com.mybatis.test;


import com.mybatis.bean.User;
import com.mybatis.dao.UserMapper;
import com.mybatis.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {

    /**
     * 查询全部用户
     */
    @Test
    public void selectUser(){
        SqlSession session = MyBatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
        session.close();
    }

    /**
     * 根据用户id查询信息
     */
    @Test
    public void testQueryUserById(){
        SqlSession session = MyBatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.selectUserById(1);
        System.out.println("用户的信息为:" + user);
        session.close();
    }

    /**
     * 根据密码和名字查询用户
     */
    @Test
    public void selectUserByNp(){
        SqlSession session = MyBatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.selectUserByNp("张三","abcdef");
        System.out.println("用户的信息为:" + user);
        session.close();
    }


    /**
     * Map传递参数查询
     */
    @Test
    public void selectUserByNP2(){
        SqlSession session = MyBatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("username","张三");
        map.put("pwd","abcdef");
        User user = mapper.selectUserByNP2(map);
        System.out.println("用户的信息为:" + user);
        session.close();
    }

    /**
     * 增加一个用户
     */
    @Test
    public void testAddUser(){
        SqlSession session = MyBatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User(5,"王五","zxc");
        int i = mapper.addUser(user);
        System.out.println("影响的行数为:" + i);
        session.commit();//提交事务,不写不会提交到数据库
        session.close();
    }

    /**
     * 修改用户信息
     */
    @Test
    public void testUpdateUser(){
        SqlSession session = MyBatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user  = mapper.selectUserById(1);
        user.setPwd("12345555");
        int  i = mapper.updateUser(user);
        System.out.println("影响的行数为:" + i);
        session.commit();
        session.close();
    }


    /**
     * 根据用户id删除信息
     */
    @Test
    public void testDeleteUser(){
        SqlSession session = MyBatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        int i = mapper.deleteUser(5);
        System.out.println("影响的行数为:" + i);
        session.commit();
        session.close();
    }

}
