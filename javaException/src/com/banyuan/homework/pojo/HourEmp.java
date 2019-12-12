package com.banyuan.homework.pojo;

import com.banyuan.homework.Employee;
import com.banyuan.homework.money.CalMoney;

public class HourEmp  extends Employee implements CalMoney {

    private  double hour;
    private  double hourMoney;

    public void setHour(double hour) {
        this.hour = hour;
    }

    public void setHourMoney(double hourMoney) {
        this.hourMoney = hourMoney;
    }

    //小时工的工资
    @Override
    public double calGetMoney() {
        return hour*hourMoney;
    }

}
