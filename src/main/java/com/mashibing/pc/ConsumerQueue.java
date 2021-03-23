package com.mashibing.pc;

import java.util.concurrent.BlockingQueue;

public class ConsumerQueue implements Runnable {

    private BlockingQueue blockingQueue;

    public ConsumerQueue(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    public void run() {
        try {
            for (int i=0;i<10;i++){
                System.out.println("消费了" + blockingQueue.take());
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
