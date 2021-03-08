package com.api.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowTest {
    public static void main(String[] args) {
        try {
            ThrowTest.readFile();
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println("打印抛出自定义异常");
        }
    }

    public static void  readFile() throws MyException {
        try {
            FileInputStream fis = new FileInputStream("D:\\a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //如果抛出的异常是运行期异常则无需处理,编译期异常要处理
            throw  new MyException("111");
        }
    }
}
