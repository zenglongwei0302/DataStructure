package com.Sort.cn;

import com.linearStructure.cn.Queue;

import java.util.Arrays;

/**
 * 队列实现基数排序
 */
public class QueueImplementationCardinalitySorting {
    public static void main(String[] args) {
        int[] arr = new int[]{789,663,52,45,987,9999,12,3,0,1,7,99,88};
        System.out.println(Arrays.toString(arr));
        queueImplementationCardinalitySorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void queueImplementationCardinalitySorting(int[] arr) {
        //取出数组最大的数字
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
            if (arr[i]>max)
                max =arr[i];
        //计算max的位数
        int maxlength = (max+"").length();

        //用于存储临时数据的队列数组
        Queue[] temp = new Queue[10];
        //为队列初始化
        for (int i = 0; i < temp.length; i++) {
            temp[i] = new Queue();
        }

        //根据最大长度决定比较的次数
        for (int i = 0,n=1; i < maxlength; i++,n*=10) {
            //把每个数分别计算余数
            for (int j = 0; j < arr.length; j++) {
                //计算余数
                int remainder = arr[j]/n%10;
                //把当前的数据放入指定的队列中
                temp[remainder].add(arr[j]);
            }
            //记录放回原数组的位置
            int index=0;

            for (int j = 0; j < temp.length; j++) {//把所有队列中的数字取出来
                while (!temp[j].isEmpty()){//当前队列不为空就取数据
                    arr[index] = temp[j].poll();  //取出数据
                    index++;  //记录下一个数据

                }

            }

        }

    }
}
