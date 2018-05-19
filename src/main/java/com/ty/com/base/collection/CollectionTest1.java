package com.ty.com.base.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * created by TY on 2018/5/18.
 */
public class CollectionTest1 {
    public static void main(String[] args) {
        //1.创建集合
        Collection c = new ArrayList();
        //2.
        c.add(10);
        c.add(130);
        Object o = new Object();
        c.add(o);

        Manager manager = new Manager(20, "JACK");
        c.add(manager);


        System.out.println(c.size());
        System.out.println(c.isEmpty());

        Object[] objects = c.toArray();
        for(Object object:objects) {
            System.out.println(object);
        }

        c.clear();
        System.out.println(c.isEmpty());
        System.out.println(c.size());
    }
}

class Manager {
    int no;
    String name;

    Manager(int no, String name) {
        this.no = no;
        this.name = name;
    }
    @Override
    public String toString() {
        return "name: " + name + " no:" + no;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {return true;}
        if(o instanceof Manager) {
            Manager m = (Manager) o;
            if(m.no == this.no && m.name.equals(this.name)) {
                return true;
            }
        }
        return false;
    }



}

/*4
false
10
130
java.lang.Object@1540e19d
name: JACK no:20
true
0*/
