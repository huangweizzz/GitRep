package com.spring.study.mapper;

public class UserServiceImpl implements  UserService{

    //获取普通数据
    //private UserDao userDao = new UserDaoImpl();
    //新加获取oracle数据
    //private UserDao userOracleDao = new UserDaoOracleImpl();
    private UserDao userDao;

    //利用构造方法来传入对象,使用不同的方法
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void getUser() {
        //新加获取oracle数据
        //userOracleDao.getUser();
        userDao.getUser();
    }
}
