package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/binary-tree-pruning/
public class BinaryTreePruning {

    private final TreeNode input;

    public BinaryTreePruning(TreeNode input) {
        this.input = input;
    }

    public TreeNode solution() {
        return hasOne(input) ? input : null;
    }

    private boolean hasOne(TreeNode node) {
        if (node != null) {
            boolean hasOneAtLeft = hasOne(node.left);
            boolean hasOneAtRight = hasOne(node.right);
            if (!hasOneAtLeft) {
                node.left = null;
            }
            if (!hasOneAtRight) {
                node.right = null;
            }
            return node.val == 1 || hasOneAtLeft || hasOneAtRight;
        }
        return false;
    }

}
