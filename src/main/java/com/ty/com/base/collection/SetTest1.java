package com.ty.com.base.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * created by TY on 2018/5/21.
 */

/**
 * Set集合
 * @param
 * @return
 */
public class SetTest1 {
    public static void main(String[] args) {
        //创建Set集合
        Set s = new HashSet();
        //无序不可重复
        s.add(123);
        s.add(123);
        s.add(123);
        s.add("chain");
        s.add("come back");

        Iterator it = s.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
/*chain
  come back
   123*/