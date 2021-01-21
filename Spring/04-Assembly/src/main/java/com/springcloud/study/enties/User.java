package com.springcloud.study.enties;


public class User {

    private  Cat cat;
    private  Dog dog;
    private  String str;


    public void setCat(Cat cat) {

        this.cat = cat;
    }

    public void setDog(Dog dog) {

        this.dog = dog;
    }

    public void setStr(String str) {

        this.str = str;
    }

    public Cat getCat() {

        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getStr() {

        return str;
    }

}
