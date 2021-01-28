package com.api.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionTest04 {

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //main()方法调用抛给main方法
    public static void readFile() throws IOException {
        FileInputStream fis = new FileInputStream("文件位置");
        fis.read();
    }
}
