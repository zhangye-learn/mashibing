package com.mashibing.ticket;

public class TicketRunnable2 implements Runnable {

    private int ticket = 5;

    public void run() {

        for (int i=0;i<100;i++){
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this){
                if (ticket >0){
                    System.out.println(Thread.currentThread().getName()+"正在出售第"+(ticket--)+"张票");
                }
            }


        }

    }

    public static void main(String[] args) {
        TicketRunnable2 ticket = new TicketRunnable2();
        Thread t1 = new Thread(ticket, "A");
        Thread t2 = new Thread(ticket, "B");
        Thread t3 = new Thread(ticket, "C");
        Thread t4 = new Thread(ticket, "D");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
