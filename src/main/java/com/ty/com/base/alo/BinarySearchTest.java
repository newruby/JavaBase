package com.ty.com.base.alo;

/**
 * created by TY on 2018/5/15.
 */
public class BinarySearchTest {

    public static void main(String[] args) {
        //increased, sorted
        int[] a = {1, 2, 4, 6, 19, 35, 27, 80};
        int dstElement = 4;
        int index= BinarySearch(a, dstElement);
        System.out.println((index == -1) ? "not found" : "dstElement's index is " + index );
    }
    public static int BinarySearch(int[] array, int element) {
        int begin = 0;
        //condition
        int end =array.length - 1;
        //condition
        while(begin <= end) {
            int mid = (begin + end) / 2;
            if(array[mid] == element) {
                return mid;
            }
            else if(array[mid] > element) {
                end = mid - 1;
            }else if(array[mid] < element ) {
                begin = mid + 1;
            }
        }
        return -1;
    }
}

