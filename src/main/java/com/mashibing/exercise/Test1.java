package com.mashibing.exercise;

public class Test1 implements Runnable {
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"===="+i);
            try {
                Thread.sleep(1050);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Thread t1 = new Thread(test1);
        t1.start();
        for (int i=10;i>0;i--){
            System.out.println(Thread.currentThread().getName()+"===="+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
