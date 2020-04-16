package com.Sort.cn;
/**
 * 简单选择排序
 */

import java.util.Arrays;

public class SimpleSelectionSorting {
    public static void main(String[] args) {
        int[] arr = new int[] {7,5,6,8,1,0,3,4,6};
        System.out.println(Arrays.toString(arr));
        simpleSelectionSorting(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void simpleSelectionSorting(int[] arr) {
        //遍历所有的数
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            //把当前遍历的数和后面的数依次比较，并记录下最小的数的下标
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[minIndex]>arr[j]){//如果后面的数比记录的数小，记录下标
                    minIndex=j;
                }

            }
            //如果最小的数和当前遍历的数的下标不一致
            if (i!=minIndex){//交换
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }


        }


    }
}
