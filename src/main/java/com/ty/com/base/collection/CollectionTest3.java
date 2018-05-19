package com.ty.com.base.collection;



import java.util.ArrayList;
import java.util.Collection;

/**
 * created by TY on 2018/5/18.
 */
public class CollectionTest3 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Integer i1 = new Integer(10);
        c.add(i1);
        System.out.println(c.contains(i1));


        Integer i2 = new Integer(10);
        System.out.println(c.contains(i2));
        c.remove(i2);

        //i2等价于i1 删除i2相当于删除i1所以最后集合中没有元素
        System.out.println(c.size());

        Manager m1 = new Manager(20 , "JACK");
        c.add(m1);

        Manager m2 = new Manager(20 , "JACK");
        //@Override equals
        System.out.println(c.contains(m2));
    }
}

/*
true
true
0
true
*/
