package com.ty.com.base.reflect;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * created by TY on 2018/5/27.
 */
public class CustomerService {
    public boolean login(String name, String pwd) {
        if ("admin".equals(name) && "123".equals(pwd)) {
            return true;
        }
        return false;
    }

    public void logout() {
        System.out.println("logout");
    }

}
