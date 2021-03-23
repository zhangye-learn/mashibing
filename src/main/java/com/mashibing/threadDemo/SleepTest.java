package com.mashibing.threadDemo;

public class SleepTest {

    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread thread = new Thread(myRun);
        thread.start();

        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"===" +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
