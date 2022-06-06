package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/
public class MaximumProductOfSplittedBinaryTree {

    private final TreeNode input;

    private int sum;
    private long result;

    public MaximumProductOfSplittedBinaryTree(TreeNode input) {
        this.input = input;
    }

    public int solution() {
        sum = sum(input);
        calculate(input);
        return (int) (result % (1e9 + 7));
    }

    private int sum(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return sum(node.left) + sum(node.right) + node.val;
    }

    private int calculate(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int fSum = calculate(node.left) + calculate(node.right) + node.val;
        int sSum = sum - fSum;
        result = Math.max(result, (long) fSum * sSum);
        return fSum;
    }

}
