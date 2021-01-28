package com.api.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionTest07 {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
