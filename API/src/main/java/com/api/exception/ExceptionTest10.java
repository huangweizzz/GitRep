package com.api.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest10 {
    public static void main(String[] args) throws IOException {
        firstLineOfFile("");
    }

    public static String firstLineOfFile(String path) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            return bufferedReader.readLine();
        }
    }
}