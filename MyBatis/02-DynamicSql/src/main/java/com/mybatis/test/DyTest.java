package com.mybatis.test;

import com.mybatis.bean.User;
import com.mybatis.dao.UserMapper;
import com.mybatis.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DyTest {


    /**
     * if-where查询
     */
    @Test
    public void queryIfWhere(){
        SqlSession session = MyBatisUtils.getSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<User> user = userMapper.queryIfWhereResult(null,"张三");
        for (User u : user) {
            System.out.println(u);
        }
    }

    /**
     * choose(where,otherwise)查询
     */
    @Test
    public void queryChooseResult(){
        SqlSession session = MyBatisUtils.getSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<User> user = userMapper.queryChooseResult(null,"李四",null);
        for (User u : user){
            System.out.println(u);
        }
    }

    @Test
    public void queryTrimResult(){
        SqlSession session = MyBatisUtils.getSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<User> user = userMapper.queryTrimResult(null,"李四");
        for (User u : user){
            System.out.println(u);
        }
    }

    @Test
    public void queryForeachResult(){
        SqlSession session = MyBatisUtils.getSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        List<User> listUser = userMapper.queryForeachResult(ids);
        for (User u : listUser){
            System.out.println(u);
        }
    }

    /**
     * 多条件模糊查询
     */
    @Test
    public void queryLikeResult(){
        SqlSession session = MyBatisUtils.getSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<User> user = userMapper.queryLikeResult(null,"张");
        for (User u : user) {
            System.out.println(u);
        }
    }

    /**
     * 批量插入(如果主键存在则修改,不存在则新增)
     */
    @Test
    public void insertForeachResult(){
        SqlSession session = MyBatisUtils.getSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<User> li = new ArrayList<User>();
        User u1 = new User();
        User u2 = new User();
        u1.setId(8);
        u1.setName("老朱");
        u1.setPwd("888");
        u2.setId(9);
        u2.setName("老刘");
        u2.setPwd("999");
        li.add(u1);
        li.add(u2);
        int i = userMapper.insertForeachResult(li);
        System.out.println("影响的记录数为:" + i);
        session.commit();
        session.close();
    }
}
