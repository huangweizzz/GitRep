package com.api.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsTest {
    public static void main(String[] args) {
        ThrowsTest t = new ThrowsTest();
        try{
            t.readFile();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    //此时的IO异常大于FileNotFoundException统一由IO抛出
    public void readFile() throws IOException {
        FileInputStream fis  = new FileInputStream("D:\\a.txt");
        int b;
        b = fis.read();
        while( b != -1){
            System.out.println((char)b);
            b = fis.read();
        }
        fis.close();
    }
}
