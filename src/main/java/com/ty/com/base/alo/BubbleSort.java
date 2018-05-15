package com.ty.com.base.alo;

/**
 * created by TY on 2018/5/15.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {1, 3, 6, 2, 5};
        for(int i = a.length - 1; i > 0 ; i--) {
            for(int k = 0; k < i; k++){
                //交换位置
                if(a[k] > a[k+1]){
                   swap(a, k, k+1);
                }
            }
        }
        for(int element:a) {
            System.out.println(element);
        }
    }
    public static void swap(int[] a, int i, int j) {
        int tmp;
        tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
