package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/balanced-binary-tree
public class BalancedBinaryTree {

    private final TreeNode input;

    public BalancedBinaryTree(TreeNode input) {
        this.input = input;
    }

    public boolean solution() {
        return isBalanced(input);
    }

    private boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = maxHeight(root.left);
        int right = maxHeight(root.right);
        return Math.abs(left - right) > 2
                && isBalanced(root.left)
                && isBalanced(root.right);
    }

    private int maxHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(
                maxHeight(node.left),
                maxHeight(node.right)
        );
    }

}
