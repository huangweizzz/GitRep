package mybatis;

import Bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;


public class MyBatisTest01 {

    //获取Session
    public SqlSessionFactory getSqlSessionFactory() throws IOException {
        //加载核心文件
        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        //读取配置文件的内容
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(in);
        return sqlSessionFactory;
    }

    //通过id查询一个用户
    @Test
    public void findUserById() throws IOException {
        SqlSession session = this.getSqlSessionFactory().openSession();
        //执行SQL语句
        User user = session.selectOne("user.findUserById", 2);
        System.out.println(user.getId());
        //释放资源
        session.close();
    }

    /**
     * #{}和${}的区别:
     * 占位符#{}，相当于jdbc中的问号？，当参数类型传递的是java简单类型的时候，花括号中的内容可以是任意字符串
     * 字符串拼接符${}，当参数传递的是java简单类型的时候，花括号中的内容只能是：value
     * 注意:sql语句中使用字符串拼接，可能引起sql注入的问题。但是mybatis框架中字符串拼接符可以放心使用。原因是mybatis是后端dao层
     * 开发，参数在前端表现层（action）和业务层（service）已经处理好
     * @throws IOException
     */

    //通过name模糊查询方式一
    @Test
    public void testFindByUserName() throws IOException {
       SqlSession session = this.getSqlSessionFactory().openSession();
        //执行SQL语句
        //select * from user where name like ?
        List<User> list = session.selectList("user.findUserByUserName", "%王%");
        for (User user: list) {
            System.out.println(user);
        }
        //释放资源
        session.close();
    }

    //通过name模糊方式二
    @Test
    public void testFindByUserName2() throws IOException {
        SqlSession session  = this.getSqlSessionFactory().openSession();
        //select * from user where name like '%李%'
        List<User> list = session.selectList("user.findUserByUserName2", '李');
        for (User user: list) {
            System.out.println(user);
        }
        //释放资源
        session.close();
    }

    //增加一个用户
    @Test
    public void addUser() throws IOException {
        //开启自动提交事务
        SqlSession session = this.getSqlSessionFactory().openSession(true);
        User user = new User();
        user.setId(4);
        user.setname("张三");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("虎门");
        session.insert("user.addUser",user);
        //事务提交
        //session.commit();
        session.close();
    }

    //根据用户id删除用户
    @Test
    public void deleteUserById() throws IOException {
        SqlSession sqlSession = this.getSqlSessionFactory().openSession(true);
        sqlSession.delete("user.deleteUserById",1);
        sqlSession.close();
    }

    //根据用户id修改用户
    @Test
    public void updateUserById() throws IOException {
        SqlSession sqlSession = this.getSqlSessionFactory().openSession(true);
        User user  = new User();
        user.setSex("女");
        user.setname("倪妮");
        user.setId(2);
        sqlSession.update("user.updateUserById",user);
        sqlSession.close();
    }




}
