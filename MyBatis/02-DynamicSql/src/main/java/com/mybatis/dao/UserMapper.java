package com.mybatis.dao;

import com.mybatis.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<User>queryIfWhereResult(@Param("id") Integer id, @Param("name") String name);

    List<User> queryChooseResult(@Param("id") Integer id , @Param("name") String name,@Param("pwd") String pwd);

    List<User>queryTrimResult(@Param("id") Integer id, @Param("name") String name);

    List<User>queryLikeResult(@Param("id") Integer id, @Param("name") String name);

    List<User>queryForeachResult(@Param("ids") List<Integer> id);

    int insertForeachResult(@Param(value = "users") List<User> users);
}
