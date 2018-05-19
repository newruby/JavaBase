package com.ty.com.base.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * created by TY on 2018/5/18.
 */
public class CollectionTest2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add(3.14);
        c.add(true);
        c.add(18);

        //1.获取迭代器对象
        Iterator it = c.iterator();
        //2.遍历

        while(it.hasNext()) {
            System.out.println(it.next());
        }

//        for(;it.hasNext();) {
//            System.out.println(it.next());
//        }

    }
}
