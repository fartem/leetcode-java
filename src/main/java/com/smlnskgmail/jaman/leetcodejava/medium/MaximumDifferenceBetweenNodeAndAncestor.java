package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/maximum-difference-between-node-and-ancestor
public class MaximumDifferenceBetweenNodeAndAncestor {

    private final TreeNode input;

    public MaximumDifferenceBetweenNodeAndAncestor(TreeNode input) {
        this.input = input;
    }

    public int solution() {
        return calculate(input, input.val, input.val);
    }

    private int calculate(TreeNode node, int min, int max) {
        if (node != null) {
            min = Math.min(node.val, min);
            max = Math.max(node.val, max);
            int left = calculate(node.left, min, max);
            int right = calculate(node.right, min, max);
            return Math.max(left, right);
        }
        return max - min;
    }
}
