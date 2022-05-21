package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/distribute-coins-in-binary-tree/
public class DistributeCoinsInBinaryTree {

    private final TreeNode input;
    private int result;

    public DistributeCoinsInBinaryTree(TreeNode input) {
        this.input = input;
    }

    public int solution() {
        dfs(input);
        return result;
    }

    private int dfs(TreeNode node) {
        if (node != null) {
            int left = dfs(node.left);
            int right = dfs(node.right);
            result += Math.abs(left) + Math.abs(right);
            return node.val + left + right - 1;
        }
        return 0;
    }

}
