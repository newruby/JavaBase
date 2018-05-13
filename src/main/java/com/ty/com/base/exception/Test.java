package com.ty.com.base.exception;

/**
 * created by TY on 2018/5/13.
 */
/**
 *  IllegalNameException
 *  CustomerService
 * @param
 * @return
 */
public class Test {
    public static void main(String[] args) {
        String username = "12345";
        CustomerService cs = new CustomerService();
        try{
            cs.register(username);
        }catch (IllegalNameException e) {
            System.out.println(e.getMessage());
        }
    }
}
