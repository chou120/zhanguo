package com.banyuan.exceptionDemo2;

public class TestTool {

    public static void main(String[] args) {

        try {
            Tool.checkScore(-10);
        } catch (MyException e) {
            e.printStackTrace();
        }


    }

}
