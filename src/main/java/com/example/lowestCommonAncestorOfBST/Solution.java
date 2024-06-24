package com.example.lowestCommonAncestorOfBST;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p == root || q == root) return root;

        if(p.val < root.val && q.val < p.val) return q;

        TreeNode current = root;
        while(current != null){
            if(p.val < root.val && q.val < p.val){


            }
        }
        if(p.val < root.val && q.val > root.val) return root;
        if(p.val < root.val && q.val > p.val) return p;
        if(p.val > root.val && q.val < p.val) return root;




        return null;
    }
}
