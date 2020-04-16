package com.Sort.cn;

import java.util.Arrays;

/**
 * 基数排序
 */
public class RadixSorting {
    public static void main(String[] args) {
        int[] arr = new int[]{789,663,52,45,987,9999,12,3,0,1,7,99,88};
        System.out.println(Arrays.toString(arr));
        radixSorting(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void radixSorting(int[] arr) {
        //取出数组最大的数字
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
            if (arr[i]>max)
                max =arr[i];
        //计算max的位数
        int maxlength = (max+"").length();

        //用于存储临时数据的数组
        int[][] temp = new int[10][arr.length];
        //用于记录在temp中相应的数组中存放的数字的数量
        int[] counts = new int[10];

        //根据最大长度决定比较的次数
        for (int i = 0,n=1; i < maxlength; i++,n*=10) {
            //把每个数分别计算余数
            for (int j = 0; j < arr.length; j++) {
                //计算余数
                int remainder = arr[j]/n%10;
                //把当前的数据放入指定的数组中
                temp[remainder][counts[remainder]] = arr[j];
                counts[remainder]++;
            }
            //记录放回原数组的位置
            int index = 0;
            //把数字取出来
            for (int j = 0; j < counts.length; j++) {
                //counts中不为0的元素就取
                if (counts[j]!=0){
                    for (int k = 0; k < counts[j]; k++) {
                        arr[index] = temp[j][k];
                        index++;
                    }
                //讲counts第j个位置的数字置0，用于下一次排序时的使用
                counts[j] = 0;

                }
                
            }

        }



    }

}
