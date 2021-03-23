package com.mashibing.consumerProduce;

public class Test {
    public static void main(String[] args) {
        Goods goods = new Goods();

        Consume consume = new Consume(goods);
        Produce produce = new Produce(goods);
        Thread t1 = new Thread(produce);
        Thread t2 = new Thread(consume);
        t1.start();
        t2.start();

    }
}
