package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/second-minimum-node-in-a-binary-tree
public class SecondMinimumNodeInABinaryTree {

    private final TreeNode input;

    private int fMin;
    private long sMin = Long.MAX_VALUE;

    public SecondMinimumNodeInABinaryTree(TreeNode input) {
        this.input = input;
    }

    public int solution() {
        fMin = input.val;
        apply(input);
        return sMin < Long.MAX_VALUE ? (int) sMin : -1;
    }

    private void apply(TreeNode node) {
        if (node == null) {
            return;
        }
        if (fMin < node.val && node.val < sMin) {
            sMin = node.val;
        } else if (fMin == node.val) {
            apply(node.left);
            apply(node.right);
        }
    }
}
