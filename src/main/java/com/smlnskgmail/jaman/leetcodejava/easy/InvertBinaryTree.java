package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/invert-binary-tree/
public class InvertBinaryTree {

    private final TreeNode input;

    public InvertBinaryTree(TreeNode input) {
        this.input = input;
    }

    public TreeNode solution() {
        return invert(input);
    }

    private TreeNode invert(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = right;
        root.right = left;
        invert(left);
        invert(right);
        return root;
    }

}
