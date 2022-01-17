package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/validate-binary-search-tree
public class ValidateBinarySearchTree {

    private final TreeNode input;

    public ValidateBinarySearchTree(TreeNode input) {
        this.input = input;
    }

    public boolean solution() {
        return isBST(input, null, null);
    }

    private boolean isBST(TreeNode node, TreeNode left, TreeNode right) {
        if (node == null) {
            return true;
        }
        if (left != null && node.val <= left.val) {
            return false;
        }
        if (right != null && node.val >= right.val) {
            return false;
        }
        return isBST(node.left, left, node) && isBST(node.right, node, right);
    }
}
