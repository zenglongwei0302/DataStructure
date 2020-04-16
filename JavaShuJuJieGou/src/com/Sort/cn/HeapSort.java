package com.Sort.cn;

public class HeapSort {

    public static void heapSort(int[] arr) {
        int start =/*最后一个子节点的父节点*/ (/*最后一个子节点的位置*/arr.length - 1) / 2;
        for (int i = start; i >= 0; i--) {
            maxHeap(arr, arr.length, i);
        }
        //把数组中的第0个与堆中的最后一个数交换位置，然后进行调整
        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            maxHeap(arr, i, 0);
        }

    }

    public static void maxHeap(int[] arr, int size, int index) {
        //左子节点
        int leftNode = 2 * index + 1;
        //右子节点
        int rightNode = 2 * index + 2;

        int max = index;
        //和左右子节点比较
        if (leftNode < size && arr[leftNode] > arr[max]) {
            max = leftNode;
        }
        if (rightNode < size && arr[rightNode] > arr[max]) {
            max = rightNode;
        }
        //交换位置
        if (max != index) {
            int temp = arr[max];
            arr[max] = arr[index];
            arr[index] = temp;
            maxHeap(arr, size, max);
        }

    }


}
