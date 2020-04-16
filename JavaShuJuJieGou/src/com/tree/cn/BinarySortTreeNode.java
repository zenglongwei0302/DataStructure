package com.tree.cn;

public class BinarySortTreeNode {

    private int value;
    BinarySortTreeNode leftNode;
    BinarySortTreeNode rightNode;
    public BinarySortTreeNode(int value){
        this.value = value;
    }
    
    /**
     * 向子树中添加节点
     * @param node
     */
    public void add(BinarySortTreeNode node) {
        if (node == null){
            return;
        }
        //判断传入的节点值与当前节点值的关系（大小关系）
        if (node.getValue() <this.getValue()){
            //如果左节点为空
            if (this.leftNode == null){
                this.leftNode = node;
            }
            else {
                this.leftNode.add(node);
            }
        }else {
            if (this.rightNode == null){
                this.rightNode = node;
            }else {
                this.rightNode.add(node);
            }
        }

    }

    /**
     * 获取当前节点的值
     * @return
     */
    public int getValue() {
        return value;
    }

    /**
     * 设置节点的值
     * @param value
     */
    public void setValue(int value){
        this.value = value;
    }

    /**
     * 中序遍历
     * @param node
     */
    public void midShow(BinarySortTreeNode node) {

        if (node==null){
            return;
        }
        leftNode.midShow(node.leftNode);
        System.out.print(node.getValue()+"  ");

        rightNode.midShow(node.rightNode);
    }

    /**
     * 查找节点
     * @param value
     * @return
     */
    public BinarySortTreeNode search(int value) {

        if (this.getValue() == value){
            return this;
        }else if (value<this.getValue()){
            if (leftNode==null){
                return null;
            }
            return leftNode.search(value);
        }else {
            if (rightNode==null){
                return null;
            }
            return rightNode.search(value);
        }
    }

    /**
     * 寻找父节点
     * @param value
     * @return
     */
    public BinarySortTreeNode searchParent(int value) {
        if ((this.leftNode!=null&&this.leftNode.getValue()==value)||(this.rightNode!=null&&this.rightNode.getValue()==value)){
            return this;
        }else {
            if (this.getValue()>value&&this.leftNode!=null){
                return this.leftNode.searchParent(value);
            }
            else if (this.getValue()<value&&this.rightNode!=null){
                return this.rightNode.searchParent(value);
            }
            else {
                return null;
            }
        }

    }
}
