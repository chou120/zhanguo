package com.banyuan.api.reg;

import static java.lang.Thread.sleep;

public class A {

    public static class myRunner implements Runnable{

        public ThreadLocal threadLocal = new ThreadLocal();

        @Override
        public void run() {
            threadLocal.set((int)(Math.random()*100));
            try {
                sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadLocal.get());
        }
    }

    public static void main(String[] args) {
        myRunner myRunner = new myRunner();
        Thread thread1 = new Thread(myRunner);
        Thread thread2 = new Thread(myRunner);
        thread1.start();
        thread2.start();
    }


}
