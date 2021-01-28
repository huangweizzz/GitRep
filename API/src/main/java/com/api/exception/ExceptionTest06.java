package com.api.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest06 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:test.txt");
        }catch (FileNotFoundException e){
            //捕获文件找不到异常
            e.printStackTrace();
        }catch (IOException e){
            //捕获文件读取异常
            e.printStackTrace();
        }
    }
}
