package com.algoquestionsAll.treeInOrderTraversal;



public class MyTree {
    TreeNode root;

    public MyTree() {
        this.root = null;
    }



    void inOrderTraversal(TreeNode root){
        if(root==null) return; //termination for recursive
        inOrderTraversal(root.left);
        System.out.print(root.val+", ");
        inOrderTraversal(root.right);
    }

}
