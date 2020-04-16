package com.tree.cn;

public class BinarySortTree {

    BinarySortTreeNode root;


    /**
     * 向二叉排序数中添加节点
     * @param node
     */
    public void add(BinarySortTreeNode node){
        if (root==null){
            root = node;
        }else {
            root.add(node);
        }
    }

    /**
     * 中序遍历
     */
    public void midShow(){
        if (root!=null){
            root.midShow(root);
        }
    }


    /**
     * 查找节点
     * @param value
     * @return
     */
    public BinarySortTreeNode search(int value){
        if (root ==null){
            return null;
        }else {
            return root.search(value);
        }
    }


    /**
     * 删除节点
     * @param value
     */
    public void delete(int value){
        if (root ==null){
            return;
        }else {
            //找到节点
            BinarySortTreeNode target = search(value);
            //未找到
            if (target == null){
                return;
            }
            //找到父节点
            BinarySortTreeNode parent = searchParent(value);
            //如果删除的节点为叶子节点
            if (target.leftNode==null&&target.rightNode==null){
                //要删除的是左节点
                if (parent.leftNode.getValue()==value){
                    parent.leftNode=null;
                }
                //要删除的是右节点
                else {
                    parent.rightNode=null;
                }
            }else if (target.leftNode!=null&&target.rightNode!=null){

                //删除右子树中最小的节点，并获取到该值
                int min = deletMin(target.rightNode);

                //替换该节点中的值
                target.setValue(min);



            }else {
                if (target.leftNode!=null){
                    //要删除的是左节点
                    if (parent.leftNode.getValue()==value){
                        parent.leftNode=target.leftNode;
                    }
                    //要删除的是右节点
                    else {
                        parent.rightNode=target.leftNode;
                    }

                }else{
                    //要删除的是左节点
                    if (parent.leftNode.getValue()==value){
                        parent.leftNode=target.rightNode;
                    }
                    //要删除的是右节点
                    else {
                        parent.rightNode=target.rightNode;
                    }

                }
            }


        }
    }


    /**
     * 删除一棵数中最小的节点并拿到该值
     * @param node
     * @return
     */
    private int deletMin(BinarySortTreeNode node) {
        BinarySortTreeNode target = node;

        //递归向左找到
        while (target.leftNode!=null){
            target = target.leftNode;
        }
        //这个节点有右子节点
        delete(target.getValue());

        return target.getValue();
    }

    /**
     * 寻找父节点
     * @param value
     * @return
     */
    public BinarySortTreeNode searchParent(int value){
        if (root == null){
            return null;
        }else {
           return root.searchParent(value);
        }
    }

}
