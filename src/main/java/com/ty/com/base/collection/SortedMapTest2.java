package com.ty.com.base.collection;

import java.util.*;

/**
 * created by TY on 2018/5/26.
 */
public class SortedMapTest2 {
    public static void main(String[] args) {
        SortedMap fruits = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                double price1 = ((Fruit)o1).price;
                double price2 = ((Fruit)o2).price;

                if(price1 < price2) {
                    return -1;
                }else if(price1 > price2) {
                    return 1;
                }else {
                    return 0;
                }
            }
        });

        Fruit p1 = new Fruit("watermelon", 3.0);
        Fruit p2 = new Fruit("cherry", 14.0);
        Fruit p3 = new Fruit("mango", 6.0);
        Fruit p4 = new Fruit("banana", 4.0);

        fruits.put(p1, 2.0);
        fruits.put(p2, 2.0);
        fruits.put(p3, 2.0);
        fruits.put(p4, 2.0);

        Set keySet = fruits.keySet();
        Iterator it = keySet.iterator();
        while(it.hasNext()) {
            Object k = it.next();
            Object v =fruits.get(k);
            System.out.println(k + "--->" + v + "kg");
        }

    }
}

class Fruit {
    String name;
    double price;

    Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit[name =" + name + " price = " + price + "]";
    }


}