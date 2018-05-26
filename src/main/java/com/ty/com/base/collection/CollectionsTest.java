package com.ty.com.base.collection;

/**
 * created by TY on 2018/5/26.
 */

import java.util.*;

/**
 * Collections工具类(java.util.Collections)完成集合(List)的排序
 * @param
 * @return
 */
public class CollectionsTest {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(6);
        l.add(1);
        l.add(5);
        l.add(10);
        l.add(3);

        Iterator it = l.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();

        Collections.sort(l);
        Iterator it1 = l.iterator();
        while(it1.hasNext()) {
            System.out.println(it1.next());
        }

        //Set集合排序转换成 List

        Set s = new HashSet();

        s.add(9);
        s.add(60);
        s.add(28);
        s.add(17);
        s.add(1);

        List lists = new ArrayList(s);

        Collections.sort(lists);
        System.out.println();
        for(int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
    }
}



        /*6
        1
        5
        10
        3

        1
        3
        5
        6
        10

        1
        9
        17
        28
        60*/
