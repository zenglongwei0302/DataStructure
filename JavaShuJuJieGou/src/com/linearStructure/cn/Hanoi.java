package com.linearStructure.cn;

public class Hanoi {
    public static void main(String[] args) {
        hanoi(5, 'A', 'B', 'C');
    }

    /**
     * @param n    盘子个数
     * @param from 开始柱子
     * @param mid  借助柱子
     * @param to   目标柱子
     */
    public static void hanoi(int n, char from, char mid, char to) {
        if (n == 1) {
            System.out.println("第" + n + "个盘子，从" + from + "移动到" + to);
        } else {
            hanoi(n - 1, from, to, mid);
            System.out.println("第" + n + "个盘子，从" + from + "移动到" + to);
            hanoi(n - 1, mid, from, to);
        }
    }
}
