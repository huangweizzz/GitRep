package com.mybatis.dao;

import com.mybatis.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    /**
     * 查询全部用户
     * @return
     */
    List<User> selectUser();

    /**
     * 根据id查询用户
     */
    User selectUserById(@Param("id") int id);

    /**
     * 根据密码和名字查询用户
     */
    User selectUserByNp(@Param("username") String username,@Param("pwd") String pwd);

    /**
     * 参数过多使用Map传递参数
     * @param map
     * @return
     */
    User selectUserByNP2(Map<String,Object> map);


    /**
     * 增加一个用户
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    int deleteUser(@Param("id") int id);
}
