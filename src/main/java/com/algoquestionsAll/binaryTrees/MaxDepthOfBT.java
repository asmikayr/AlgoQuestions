package com.algoquestionsAll.binaryTrees;
/*
Given the root of a binary tree, find its maximum depth. The maximum depth is the number of nodes
 along the longest path from the root node down to the farthest leaf node.
 */

public class MaxDepthOfBT {
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // Recursively find the depth of the left and right subtrees
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // The maximum depth is the larger of the two, plus one for the root node
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        // Test case 1: root = [3, 9, 20, null, null, 15, 7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        System.out.println("Maximum Depth: " + maxDepth(root)); // Output: 3

        // Test case 2: root = [1, null, 2]
        root = new TreeNode(1);
        root.right = new TreeNode(2);
        System.out.println("Maximum Depth: " + maxDepth(root)); // Output: 2

        // Test case 3: root = null (empty tree)
        root = null;
        System.out.println("Maximum Depth: " + maxDepth(root)); // Output: 0
    }
}
