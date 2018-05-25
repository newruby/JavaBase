package com.ty.com.base.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * created by TY on 2018/5/22.
 */

/**
 * 让SortedSet集合排序第二种方式：java.util.Comparator
 * 单独写一个比较器
 * @param
 * @return
 */
public class SortedSetTest3 {
    public static void main(String[] args) {
        //创建TreeSet集合的时候提供一个比较器
        SortedSet products = new TreeSet(new ProductComparator());

//        //匿名内部类
//        SortedSet products = new TreeSet(new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                double price1 = ((Product)o1).price;
//                double price2 = ((Product)o2).price;
//
//                if(price1 == price2) {return 0;}
//                else if (price1 < price2) {
//                    return -1;
//                }else {
//                    return 1;
//                }
//            }
//        });

        Product p1 = new Product(5.8);
        Product p2 = new Product(16.9);
        Product p3 = new Product(13.9);
        Product p4 = new Product(12.9);

        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);

        Iterator it =  products.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

class Product {
    double price;

    Product(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return price + "";
    }
}

//单独写一个比较器
class ProductComparator implements Comparator {

    //按商品价格排序
    @Override
    public int compare(Object o1, Object o2) {
        double price1 = ((Product)o1).price;
        double price2 = ((Product)o2).price;

        if(price1 == price2) {return 0;}
        else if (price1 < price2) {
            return -1;
        }else {
            return 1;
        }
    }
}

       /*5.8
        12.9
        13.9
        16.9*/