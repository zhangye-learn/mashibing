package com.mashibing.threadDemo;

public class ThreadApiDemo implements Runnable{

    public static void main(String[] args) {
        Thread thread =Thread.currentThread();

        System.out.println(thread.getName());

        System.out.println(thread.getId());

        System.out.println(thread.getPriority());

        thread.setPriority(10);

        System.out.println(thread.getPriority());

        ThreadApiDemo threadApiDemo = new ThreadApiDemo();
        Thread t1 = new Thread(threadApiDemo);
        t1.start();
        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + "+++++" + i);
        }


    }

    public void run() {
        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + "+++++++++" + i);
        }

    }
}
