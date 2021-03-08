package com.api.exception;

public class IndexOutException {
    public static void main(String[] args) {
        String friends []  = {"lisa","bill","rose"};
        for(int i = 0; i < 5;i++){
            System.out.println(friends[i]);
        }
    }
}
