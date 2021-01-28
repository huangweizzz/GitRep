package com.api.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionTest08 {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D://test1.txt");
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } finally {
            System.out.println("catch加了return能执行finally");
            if (null != fis) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
