package com.ty.com.base.io;

import java.io.Serializable;

/**
 * created by TY on 2018/5/26.
 */
public class User implements Serializable {
    //自己写一个序列化的版本号而不是让系统自动
    static final long serialVersioUID = 1298762534L;
    String name;
    //不让该属性序列化
//   transient String name;

    User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserName = " + name ;
    }
}
