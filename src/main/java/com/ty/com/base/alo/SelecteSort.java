package com.ty.com.base.alo;

/**
 * created by TY on 2018/5/15.
 */
public class SelecteSort {
    public static void main(String[] args) {
        int[] a = {1, 3, 6, 2, 5};
        for(int i = 0; i < a.length - 1 ; i++) {
            //记录最小值
            int min = i;

            for(int j = i + 1; j < a.length; j++){
                if(a[min] > a[j]){
                    min = j;
                }
            }
            //交换位置
            if(min != i) {
                BubbleSort.swap(a, min, i);
            }

        }

//        for(int  m = 0; m < a.length ;m++){
//            System.out.println(a[m]);
//        }
        for(int element:a) {
            System.out.println(element);
        }
    }
}
