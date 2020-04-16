package com.Sort.cn;

import java.util.Arrays;

/**
 * 希尔排序
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 5, 6, 8, 1, 0, 3, 4, 6};
        System.out.println(Arrays.toString(arr));
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int[] arr) {
        //遍历所有的步长
        for (int d = arr.length / 2; d > 0; d /= 2) {
            //遍历所有的元素
            for (int i = d; i < arr.length; i++) {
                //遍历本组中所有的元素
                for (int j = i - d; j >= 0; j -= d) {
                    //如果当前元素大雨加上步长后的那个元素
                    if (arr[j] > arr[j + d]) {
                        int temp = arr[j];
                        arr[j] = arr[j + d];
                        arr[j + d] = temp;
                    }

                }
            }

        }

    }

}
