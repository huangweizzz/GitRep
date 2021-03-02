package com.api.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest05 {
    public static void main(String[] args) {
//        try {
//            //处理抛出的异常
//            readFile();
//
//        } catch (MyException e) {
//            //是什么导致e异常的原始异常
//            System.out.println(e.getCause());
//            //e.printStackTrace();
//        }
    }

    //抛出自定义异常
    public static String  readFile() {
        try {
            FileInputStream fis = new FileInputStream("D:test.txt");
            return  null;
        }catch (FileNotFoundException e){
            MyException ex = new MyException("read file failed");
            //保存原始异常,在后面抛出的异常中能准确的找到
            ex.initCause(e);
            //throw  ex;
            //如果是抛出运行时异常,则不用声明在方法上,编译期异常要用,如果方法时有返回值,则抛出异常无需return,因为没走到return就抛出了异常
            throw  new RuntimeException("111");
        }
    }
}
