package com.banyuan.collectionDemo.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;

public class Test {


    public static void main(String[] args) {

//        Object [] obj={12,"412","哈哈是"};
//
//        obj= Arrays.copyOf(obj, obj.length+1);
//        System.out.println(obj.length);
//        for (Object j:obj) {
//            System.out.println(j);
//        }

        MyCollection myCollection = new MyCollection();
        myCollection.add("你好");
        myCollection.add(true);
        myCollection.add(34.3);
        myCollection.add(12);
        myCollection.add(new Person("赵老二"));
        myCollection.add("犀利哥");

        Collection c = new ArrayList<>();
        c.add("大保健");
        myCollection.add(c);

        //myCollection.add(null);

      //  System.out.println(myCollection.size());

    //    System.out.println("------>>>>" + myCollection.contains(new Person("赵老二")));

//        Object [] b=myCollection.getObj();
//        for (Object  o:b) {
//            System.out.println(o);
//        }

//        myCollection.remove(new Person("赵老二"));
//        System.out.println(myCollection.size());


        MyCollection myCollection2 = new MyCollection();
        myCollection2.add("你好");
        myCollection2.add(true);
        myCollection2.add(34.3);
        myCollection2.add(13);
//        myCollection2.add(new Person("赵老二"));
//        myCollection2.add("犀利哥");
//      Collection c1 = new ArrayList<>();
//       c1.add("大保健");
//       myCollection2.add(c1);

      //  myCollection.addAll(myCollection2);

     //   myCollection.retainAll(myCollection2);


      // myCollection.removeAll(myCollection2);

        System.out.println(myCollection.containsAll(myCollection2));

       // System.out.println(myCollection.contains(new Person("赵老二")));


       Object [] objects= myCollection.toArray();
        for (Object  o: objects) {
            System.out.println(o);
        }



    }


}
