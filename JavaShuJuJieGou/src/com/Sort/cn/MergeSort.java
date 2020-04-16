package com.Sort.cn;


import java.util.Arrays;

/**
 *      归并排序
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7,5,6,8,1,0,3,4,6};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    /**
     *
     * @param arr  传入待排序的数组
     * @param low   排序开始的地方（不一定要从第0个开始）
     * @param high  排序结束的地方 （不一定要在最后一个结束）
     */
    public static void mergeSort(int[] arr,int low,int high) {
        int mid = (low+high)/2;
        if (low<high){
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }

    }

    public static void merge(int[] arr,int low,int mid,int high) {

        int[] temp = new int[high-low+1];//用于存储归并后的临时数组
        int i = low;//用于记录第一个数组中需要遍历的下标
        int j = mid+1;  //用于记录第二个数组需要遍历的下标
        int index = 0;  //用于记录在临时数组中存放的下标

        //循环遍历两个数组，取出小的数字，放入临时的数组中
        while (i<=mid && j<=high){

            if (arr[i] <= arr[j]){//第一个数组的数据更小
                //把小的数据放入临时数组中
                temp[index] = arr[i];
                //让下标后移一位
                i++;
            }else {//第二个数组的数据更小
                temp[index] = arr[j];//把小的数据放入临时数组中
                j++;  //下标后移
            }
            index++;
        }
        //处理多余的数据
        while (j <= high){  //第二个数组的数据未取完
            temp[index] = arr[j];
            j++;
            index++;
        }
        while (i <= mid){  //第一个数组的数据未取完
            temp[index] = arr[i];
            i++;
            index++;
        }
        //把临时数组里面的数据放入原数组
        for (int k = 0; k < temp.length; k++) {
            arr[k+low] = temp[k];
        }

    }
}
