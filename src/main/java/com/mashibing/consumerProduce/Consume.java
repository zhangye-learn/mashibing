package com.mashibing.consumerProduce;

public class Consume implements Runnable {

    private Goods goods;

    public Consume(Goods goods) {
        this.goods = goods;
    }

    public void run() {
        for (int i=0; i<10;i++){
            goods.get();
        }



    }
}
