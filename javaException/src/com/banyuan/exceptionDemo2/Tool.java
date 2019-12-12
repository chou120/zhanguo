package com.banyuan.exceptionDemo2;

public class Tool {

//    throws: 自动抛出异常  经常由 虚拟机来处理这个异常问题

//    throw   手动抛出异常对象  可以自己捕捉异常也可以交给虚拟机



    public  static  void   checkScore(int  score) throws MyException {
        if(score<0||score>100){
            //手动抛出异常的对象
            throw   new MyException("输入的分数不在有效范围,请重新输入...");
        }else{
            System.out.println("分数有效...");
        }


    }


}
