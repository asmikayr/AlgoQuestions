package com.algoquestionsAll.lowestCommonAncestorOfBST;

public class Solution {

    public static void main(String[] args) {
        MyTree tree=new MyTree();
        int[] numbers=new int[] {10, 6, 8, 20};
        for (int i = 0; i <4; i++) {
            tree.insert(numbers[i]);
        }

       // lowestCommonAncestor(tree.root, 6, 20);

    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q)  return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left != null && right != null)   return root;
        return left != null ? left : right;
    }
}
