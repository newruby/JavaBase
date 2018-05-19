package com.ty.com.base.collection;

/**
 * created by TY on 2018/5/18.
 */
public class Linked {
    //节点
    Entry entry;
    Linked() {
        entry = new Entry(null, null);
    }
    //add
    public void add(Object data) {
        //关键怎么想后找？？？
        if(entry.next == null) {
            entry.next = new Entry(data, null);
            entry = entry.next;
        }

    }

    //remove
    public void remove(Object data) {
        //关键怎么从头开始找？？？
        while(entry.next.data == data) {
            entry.next = entry.next.next;
        }
    }

    //find
    public boolean find(Object data) {

        while(entry.next != null) {
            if(entry.data == data) {
                return true;
            }else {
                //关键怎么想后找？？？
                entry = entry.next;
            }
        }
        return false;



    }


    //内部类
    static class Entry {
        Object data;
        Entry next;

        Entry() {}
        Entry(Object data, Entry next) {
            this.data = data;
            this.next = next;
        }

    }
}
