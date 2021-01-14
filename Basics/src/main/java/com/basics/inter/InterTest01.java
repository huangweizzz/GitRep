package com.basics.inter;


import java.util.ArrayList;
import java.util.List;

public class InterTest01 {
    public static void main(String[] args) {
        /**
         * 接口 对象 = new实现类和实现类 对象 = new 实现类的区别
         * 前者只能够调用接口特有的方法,而不能调用实现类的方法
         * 后者可以调用实现类特有的方法
         */
        List<String> li = new ArrayList<String>();
        ArrayList<String> al = new ArrayList<String>();
    }

}
