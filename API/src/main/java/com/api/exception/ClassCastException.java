package com.api.exception;

import java.util.Date;

public class ClassCastException {
    public static void main(String[] args) {
        Object obj = new Date();
        Order order;
        order = (Order) obj;
        System.out.println(order);

    }
}
class Order{

}
