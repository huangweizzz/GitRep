package com.api.exception;

public class ExceptionTest03 {
    public static void main(String[] args) {
        try {
            test();
        } catch (MyException e) {
            System.out.println("Catch My Exception");
            e.printStackTrace();
        }
    }
    public static void test() throws MyException{
        try {
            int i = 10/0;
            System.out.println("i="+i);
        } catch (ArithmeticException e) {
            throw new MyException("This is MyException");
        }
    }
}
//自定义异常
class MyException extends Exception {
    public MyException() {

    }
    public MyException(String msg) {
        super(msg);
    }
}