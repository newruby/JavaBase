package com.ty.com.base.collection;

/**
 * created by TY on 2018/5/18.
 */

import com.ty.com.base.ObjectOriented.interfaces.A;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *迭代器remove
 *
 */
public class CollectionTest4 {
    public static void main(String[] args) {
        Collection c  = new ArrayList();
        c.add(10);
        c.add(20);
        c.add(30);

        Iterator it= c.iterator();
        while(it.hasNext()) {
            it.next();
            it.remove();
//          并不推荐集合自身remove
//          Object o = it.next();
//          c.remove(o);
            // 用集合自身的方法 删了第一个后报错 需要重新获取迭代器再删除
//          it = c.iterator();
        }
        System.out.println(c.size());
    }
}
