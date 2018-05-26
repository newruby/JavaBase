package com.ty.com.base.collection;

import sun.security.action.PutAllAction;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * created by TY on 2018/5/26.
 */

/**
 * 无需不可重复 如果想自动排序key部分元素需要1.实现Comparable接口  2.单独写一个比较器
 * @param
 * @return
 */
public class SortedMapTest {
    public static void main(String[] args) {
        SortedMap products = new TreeMap();

        Products p1 = new Products("watermelon", 3.0);
        Products p2 = new Products("cherry", 14.0);
        Products p3 = new Products("mango", 6.0);
        Products p4 = new Products("banana", 4.0);

        products.put(p1, 2.0);
        products.put(p2, 2.0);
        products.put(p3, 2.0);
        products.put(p4, 2.0);

        Set keySet = products.keySet();
        Iterator it = keySet.iterator();
        while(it.hasNext()) {
            Object k = it.next();
            Object v = products.get(k);
            System.out.println(k + "--->" + v + "kg");
        }

    }
}

class Products implements Comparable {
    String name;
    double price;

    Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product[name =" + name + " price = " + price + "]";
    }

    @Override
    public int compareTo(Object o) {
        double price1 = this.price;
        double price2 = ((Products)o).price;

        if(price1 < price2) {
            return -1;
        }else if(price1 > price2) {
            return 1;
        }else {
            return 0;
        }
    }
}

        /*Product[name =watermelon price = 3.0]--->2.0kg
        Product[name =banana price = 4.0]--->2.0kg
        Product[name =mango price = 6.0]--->2.0kg
        Product[name =cherry price = 14.0]--->2.0kg*/