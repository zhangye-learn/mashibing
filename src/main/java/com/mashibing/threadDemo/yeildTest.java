package com.mashibing.threadDemo;

public class yeildTest {

    public static void main(String[] args) {
        MyRun run = new MyRun();
        Thread thread = new Thread(run);
        thread.start();

        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"-----"+i);
            if (i==2){
                Thread.yield();
                System.out.println(Thread.currentThread().getName()+"==="+i+"礼让一次");
            }else{
                System.out.println(Thread.currentThread().getName()+"====="+i);
            }
        }

    }

}
