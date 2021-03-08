package com.api.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOExp {
    public static void main(String[] args) {
        //此时的文件输入流为编译期异常需要处理
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\a.txt");
            int b;
            b = fis.read();
            while (b != -1) {
                System.out.println((char) b);
                b = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void readFile(String file) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("D:\\a.txt");
    }
}
