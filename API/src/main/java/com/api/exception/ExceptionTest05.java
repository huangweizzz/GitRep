package com.api.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest05 {
    public static void main(String[] args) {
        try {
            //处理抛出的异常
            readFile();

        } catch (MyException e) {
            //是什么导致e异常的原始异常
            System.out.println(e.getCause());
            //e.printStackTrace();
        }
    }

    //抛出自定义异常
    public static void readFile() throws  MyException{
        try {
            FileInputStream fis = new FileInputStream("D:test.txt");
        }catch (FileNotFoundException e){
            MyException ex = new MyException("read file failed");
            //保存原始异常,在后面抛出的异常中能准确的找到
            ex.initCause(e);
            throw  ex;
        }
    }
}
