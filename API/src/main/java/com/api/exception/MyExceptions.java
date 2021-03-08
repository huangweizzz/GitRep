package com.api.exception;

import java.io.Serializable;

public class MyExceptions extends Exception implements Serializable {

    private static final long serialVersionUID = -7510981933768981974L;

    private int idNumber;

    public MyExceptions(String message,int id){
        super(message);
        this.idNumber = id;
    }

    public int getId(){
        return idNumber;
    }


}
