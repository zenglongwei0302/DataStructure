package com.Sort.cn;

import java.util.Arrays;

/**
 * 快速排序
 *
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[] {7,5,6,8,1,0,3,4,6};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            //把数组的第0个元素作为标准数
            int stard = arr[start];
            //纪录需要排序的下标
            int low = start;
            int high = end;

            //循环找比标准数大的数和小的数
            while (low < high) {
                while (low < high && stard <= arr[high]) {//右边的数组比标准数大
                    high--;
                }
                //右边的数比标准数小，进行替换
                arr[low] = arr[high];

                while (low < high && arr[low] <= stard) {//左边的数比标准数小
                    low++;
                }
                arr[high] = arr[low];
            }
            //把标准数填进去
            arr[low] = stard;

            //处理所有比标准数小的数
            quickSort(arr, start, low);

            //处理所有比标准数大的数
            quickSort(arr, low + 1, end);
        }

    }
}
