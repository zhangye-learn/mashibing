package com.mashibing.pc;


import java.util.concurrent.BlockingQueue;

public class ProducerQueue implements Runnable {

    private BlockingQueue blockingQueue;

    public ProducerQueue(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("生产了" + i);
            try {
                blockingQueue.put(i);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
