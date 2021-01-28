package com.api.exception;

import java.io.*;

public class ExceptionTest09 {
    public static void main(String[] args) throws IOException {
        firstLineOfFile("");
    }

    public static String firstLineOfFile(String path) throws IOException {
        BufferedReader bufferedReader = null;
        try{
            bufferedReader = new BufferedReader(new FileReader(path));
            //读取出现问题
            return bufferedReader.readLine();
        }finally {
            //出现2个异常,但是只有流关闭异常才被发现
            bufferedReader.close();
        }
    }
}
