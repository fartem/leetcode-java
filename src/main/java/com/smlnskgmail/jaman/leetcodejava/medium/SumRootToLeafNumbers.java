package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/sum-root-to-leaf-numbers
public class SumRootToLeafNumbers {

    private final TreeNode input;

    public SumRootToLeafNumbers(TreeNode input) {
        this.input = input;
    }

    public int solution() {
        return sum(input, 0);
    }

    private int sum(TreeNode node, int curr) {
        if (node == null) {
            return 0;
        }
        curr = curr * 10 + node.val;
        if (node.left == null && node.right == null) {
            return curr;
        }
        return sum(node.left, curr) + sum(node.right, curr);
    }
}
