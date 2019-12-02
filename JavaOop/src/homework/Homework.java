package homework;

import com.banyuan.oop1.pojo.Car;
import com.banyuan.oop1.pojo.Tools;

public class Homework {

//    2.现有汽车类    Car   型号   汽车名   颜色    生产日期  制造商   等
//    如: 奔驰   大奔s300     黑色     2019-10-20  made in china
//            有不同的汽车存储在汽车仓库里面
//    输入要买的汽车型号,卖出去的车从仓库移除该车记录，如果有不同的人来买一样的车子呢

    public static void main(String[] args) {

        Tools.addCar(new  Car("大奔"+9+"系列","奔驰","rgb"+9,"2018-01-1"+9,"china"));

      //  Tools.println();

        Tools.addCar(new  Car("大奔"+19+"系列","奔驰","rgb"+9,"2018-01-1"+9,"china"));

        //Tools.println();

        Tools.delCar("大奔0系列");

        Tools.println();


        Car   c=new Car();

        Car [] ca=new Car[10];
        ca[0]=c;






    }





}
