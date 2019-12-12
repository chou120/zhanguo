package com.banyuan.packaging;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Demo2 {
    public static void main(String[] args) {

        System.out.println(0.01+0.09);  // 0.09999999999999999
        System.out.println(0.3-0.23);  //  0.06999999999999998
        System.out.println(1.023*1000); // 1022.9999999999999
        System.out.println(1.22/100);  //  0.012199999999999999

        BigDecimal  bigDecimal1=new BigDecimal("0.01");
        BigDecimal  bigDecimal2=new BigDecimal("0.09");

        System.out.println(bigDecimal1.add(bigDecimal2));
        System.out.println(bigDecimal1.divide(bigDecimal2,5,BigDecimal.ROUND_CEILING));

        // int   x=123123123123;
        // Integer  m=12123123212;

        BigInteger  bigInteger1=new BigInteger("21" );
        BigInteger  bigInteger2=new BigInteger("26" );

        System.out.println(bigInteger1.add(bigInteger2));
        System.out.println(bigInteger1.multiply(bigInteger2));
        System.out.println(bigInteger1.divide(bigInteger2));

        BigInteger[] b= bigInteger1.divideAndRemainder(bigInteger2);
        System.out.println(b.length);
        System.out.println(b[0]+"----"+b[1]);





    }


}
