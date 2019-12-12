package com.banyuan.cn.Outer.demo2;

public class Test {

    public static void main(String[] args) {
        PersonDemo personDemo = new PersonDemo();

        personDemo.method(new Person() {
            @Override
            public void show(String username, String password) {
                System.out.println(username+"----"+password);
            }
        }, "沾上干", "苏黎世");
    }
}
