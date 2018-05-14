package com.ty.com.base.arrays;

import javax.lang.model.element.NestingKind;

/**
 * created by TY on 2018/5/13.
 */
public class ArrayTest3 {
    public static void main(String[] args) {


        int [] src = {1,2,3,4,5,6};
        int[] dst = {1, 2 ,7 ,8 ,9,10 };
        System.arraycopy(src, 3, dst, 3,3);
        //       copy(src, 6);
        for(int i = 0; i < dst.length; i++) {
            System.out.println(dst[i]);
        }
    }

/*    public Object copy (Object src, int srcPos, Object dst, int destPos, int length) {

        for(int i = 0; i < length; i++) {
            dst[destPos++] = src[srcPos++];
        }
        return dst;
    }*/
/*    public static Object copy (Object[] src, int length) {
        Object[] dst = new Object[length];
        src = new Object[length];
        for(int i = 0; i < length; i++) {
            dst[i] = src[i];
        }
        return dst;
    }*/
}
