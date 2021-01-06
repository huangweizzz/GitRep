package Dao;

import Bean.User;
import Bean.UserQureyVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface UserDao {
    //根据用户id查询用户
    User findUserById(Integer id);

    //使用pojo包装类来实现用户信息的总和查询
    List<User> findUserCustom(UserQureyVo userQureyVo);

    List<User> findUserList(UserQureyVo userQureyVo);

    List<User>  findUserListForeach(int ids[]);

    List<User>  findUserListMap(@Param("map") Map<String, String> map);
}
