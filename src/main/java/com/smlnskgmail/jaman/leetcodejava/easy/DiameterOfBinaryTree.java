package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/diameter-of-binary-tree
public class DiameterOfBinaryTree {

    private final TreeNode input;

    private int max;

    public DiameterOfBinaryTree(TreeNode input) {
        this.input = input;
    }

    public int solution() {
        calculateMaxDepth(input);
        return max;
    }

    private int calculateMaxDepth(TreeNode node) {
        if (node != null) {
            int l = calculateMaxDepth(node.left);
            int r = calculateMaxDepth(node.right);
            max = Math.max(max, l + r);
            return Math.max(l, r) + 1;
        }
        return 0;
    }
}
