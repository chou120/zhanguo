package com.banyuan.exceptionDemo1;

public class ExceptionDemo {


    public static void main(String[] args) {

        try {
            int  num=4/0;
            System.out.println("哈哈哈");
        }catch (ArithmeticException  e){
            e.printStackTrace();
            System.out.println("你好");

            System.exit(0); //

          //  return ;
        }finally {  //只要虚拟机不停止 都会去执行这个里面的代码
            System.out.println("finally块....");
        }

        try{
            int  num=4/0;
        }finally {
            //一般用来解决资源的释放
            System.out.println("按上年啥事");
        }
    }
}
