package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/deepest-leaves-sum/
public class DeepestLeavesSum {

    private final TreeNode input;

    private int maxDeep = 0;

    public DeepestLeavesSum(TreeNode input) {
        this.input = input;
    }

    public int solution() {
        maxDeep = maxDeep(input, 0);
        return traverse(input, 0);
    }

    private int maxDeep(TreeNode node, int curr) {
        if (node != null) {
            int left = maxDeep(node.left, curr + 1);
            int right = maxDeep(node.right, curr + 1);
            return Math.max(left, right);
        }
        return curr;
    }

    private int traverse(TreeNode node, int curr) {
        if (node != null) {
            if (curr + 1 == maxDeep) {
                return node.val;
            }
            int left = traverse(node.left, curr + 1);
            int right = traverse(node.right, curr + 1);
            return left + right;
        }
        return 0;
    }

}
