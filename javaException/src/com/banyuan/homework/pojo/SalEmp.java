package com.banyuan.homework.pojo;

import com.banyuan.homework.Employee;
import com.banyuan.homework.money.CalMoney;

public class SalEmp extends Employee implements CalMoney {

    private  double salSum;

    //有基本工资
    public void setSalSum(double salSum) {
        this.salSum = salSum;
    }

    //销售员工的工资
    @Override
    public double calGetMoney() {
       double  sum=0;
        if(salSum<10000){
            sum=salSum*0.1;
        }else if(salSum>=10000&&salSum<100000){
            sum=salSum*0.15;
        }else{
            sum=salSum*0.18;
        }

        return sum;
    }
}
