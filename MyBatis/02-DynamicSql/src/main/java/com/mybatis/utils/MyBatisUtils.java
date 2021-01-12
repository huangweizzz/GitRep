package com.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static{
        try {
            String resource = "MyBatisConfig.xml";
            InputStream ins = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(ins);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //获取SqlSession连接
    public static SqlSession getSession(){

        return sqlSessionFactory.openSession();
    }
}
