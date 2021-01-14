package com.spring.mapper;

public class UserServiceImpl implements  UserService{
    //private UserDao userDao = new UserDaoImpl();

    private  UserDao userDao;
    //利用set实现
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void getUserService() {
        userDao.getUser();
    }
    //当我们再次调用UserDao的方法时,又要重新调用一次,代码的耦合性太高
    //优化:不去实现它,而是留出一个接口


}
