package mybatis;

import Bean.User;
import Bean.UserQureyVo;
import Dao.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapperTest {
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void testFindUserId() throws IOException {
        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper的对象,mybatis自动生成mapper的代理对象
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        //调用userdao的方法
        User user = userMapper.findUserById(2);
        System.out.println(user);
    }

    @Test
    public void testFindUser() throws IOException {
        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setSex("女");
        user.setname("倪妮");
        UserQureyVo userQureyVo = new UserQureyVo();
        userQureyVo.setUser(user);
        //调用userdao的方法
        List<User> list  = userMapper.findUserCustom(userQureyVo);
        System.out.println(list);
    }

    //使用动态SQL if-test查询
    @Test
    public void  findUserList() throws IOException {
        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        UserQureyVo userQureyVo = new UserQureyVo();
        User user = new User();
        user.setname("倪");
        //这里使用动态SQL,如果不设置某个值,条件不会拼接在SQL中
        //user.setSex("男");
        userQureyVo.setUser(user);
        List<User> userList = userMapper.findUserList(userQureyVo);
        System.out.println(userList);//User [id=0, name=倪, sex=null, birthday=null, address=null]
    }

    @Test
    public void findUserListForeach() throws IOException {
        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        int arr[] = {3,4};
        List<User> userList  =  userMapper.findUserListForeach(arr);
        System.out.println(userList);
    }

    @Test
    public void findUserListMap() throws IOException {
        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        Map<String,String> map = new HashMap<String,String>();
        //map.put("1","张三");
        map.put("2","倪妮");
        List<User> userList = userMapper.findUserListMap(map);
        System.out.println(userList);

    }
}
