package com.mashibing.pc;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {
    public static void main(String[] args) {
        BlockingQueue queue = new ArrayBlockingQueue(5);

        ProducerQueue producerQueue = new ProducerQueue(queue);
        ConsumerQueue consumerQueue = new ConsumerQueue(queue);

        new Thread(producerQueue).start();
        new Thread(consumerQueue).start();

    }
}
