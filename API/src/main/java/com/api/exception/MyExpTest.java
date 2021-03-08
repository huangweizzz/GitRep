package com.api.exception;

public class MyExpTest {
    public void regist(int num) throws MyExceptions {
        if (num < 0) {
            throw new MyExceptions("人数为负数不合理", 3);
        } else {
            System.out.println("登记人数" + num);
        }
    }

    public void manager() {
        try {
            regist(100);
        } catch (MyExceptions e) {
            System.out.println("登记失败,出错种类" + e.getId());
        }
    }

    public static void main(String[] args) {
        MyExpTest t = new MyExpTest();
        t.manager();
    }
}
