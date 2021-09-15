package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/symmetric-tree
public class SymmetricTree {

    private final TreeNode input;

    public SymmetricTree(TreeNode input) {
        this.input = input;
    }

    public boolean solution() {
        return isMirror(input.left, input.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left != null && right != null && left.val == right.val) {
            return isMirror(left.left, right.right)
                    && isMirror(left.right, right.left);
        }
        return false;
    }

}
