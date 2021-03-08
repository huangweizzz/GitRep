package com.api.exception;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            int i = 10 / 0;
            //Exception捕获抛出的异常
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finally语句被执行");
        }
    }
}
