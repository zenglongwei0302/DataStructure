package com.tree.cn;

public class HuffmanTreeNode implements Comparable<HuffmanTreeNode>{
    int value;
    HuffmanTreeNode leftNode;
    HuffmanTreeNode rightNode;

    public HuffmanTreeNode(int value){
        this.value = value;
    }

    @Override
    public int compareTo(HuffmanTreeNode o) {
        return -(this.value - o.value);
    }
}
