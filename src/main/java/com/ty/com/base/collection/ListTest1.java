package com.ty.com.base.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * created by TY on 2018/5/21.
 */
public class ListTest1 {
    public static void main(String[] args) {
        //创建List集合
        List l = new ArrayList();

        //添加元素
        l.add(123);
        l.add("TY");
        l.add("Track");
        //有序可重复
        l.add("TY");

        //
        l.add(1,233);

        //取得第一个元素
        System.out.println(l.get(0));

        //遍历  (List集合特有遍历方式)
        for(int i = 0; i < l.size(); i++) {
            //Object element = l.get(i)
            System.out.println(l.get(i));
        }
        //迭代器遍历
        Iterator it = l.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

        /*123
        123
        233
        TY
        Track
        TY
        123
        233
        TY
        Track
        TY*/