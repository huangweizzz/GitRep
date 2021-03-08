package com.api.exception;

public class IndexOutExp {
    public static void main(String[] args) {
        String friends[] = {"lisa","bill","rose"};
        try {
            for(int i  = 0; i < 5;i++){
                System.out.println(friends[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index err");
        }
        System.out.println("\nthis is the end");
    }
}
