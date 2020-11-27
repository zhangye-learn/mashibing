package com.mashibing.collection;

import java.util.ArrayList;
import java.util.Collection;

public class collectionDome {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(true);
        collection.add(1.23);
        collection.add("abc");

        System.out.println(collection);
    }
}
