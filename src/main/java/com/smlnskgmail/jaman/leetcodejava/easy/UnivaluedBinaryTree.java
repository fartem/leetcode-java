package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/univalued-binary-tree
public class UnivaluedBinaryTree {

    private final TreeNode input;

    public UnivaluedBinaryTree(TreeNode input) {
        this.input = input;
    }

    public boolean solution() {
        return isUniValued(input, input.val);
    }

    private boolean isUniValued(TreeNode root, int num) {
        if (root == null) {
            return true;
        }
        return root.val == num && isUniValued(root.left, num) && isUniValued(root.right, num);
    }
}
