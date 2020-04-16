package com.Sort.cn;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7,5,6,8,1,0,3,4,6};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {

        //遍历所有的数字
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                //遍历当前数字前面的所有数字
                int j;
                for (j = i - 1; j >= 0 && arr[j] > temp; j--) {

                    //把前一个数字赋给后面一个位置
                    arr[j + 1] = arr[j];
                }
                //
                arr[j + 1] = temp;
            }

        }

    }

}
