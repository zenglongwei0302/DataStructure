package com.Sort.cn;

import java.util.Arrays;

/**
 * 冒泡排序
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] {7,5,6,8,1,0,3,4,6};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }


    /**
     *
     * @param arr   比较length-1轮
     *
     *
     */
    public static void bubbleSort(int[] arr){
        //控制比较的轮数
        for (int i = 0; i < arr.length - 1; i++) {
            //控制比较的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


    }


}
