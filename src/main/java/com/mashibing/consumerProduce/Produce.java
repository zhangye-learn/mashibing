package com.mashibing.consumerProduce;

public class Produce implements Runnable {

    private Goods goods;

    public Produce(Goods goods) {
        this.goods = goods;
    }

    public void run() {
        for(int i=0;i<10;i++){
            if(i % 2==0){
                goods.set("哇哈哈", "矿泉水");
            }else {
                goods.set("旺仔","小馒头");
            }

        }





    }
}
