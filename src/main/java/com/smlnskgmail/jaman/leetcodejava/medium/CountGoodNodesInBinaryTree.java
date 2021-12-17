package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/count-good-nodes-in-binary-tree
public class CountGoodNodesInBinaryTree {

    private final TreeNode input;

    public CountGoodNodesInBinaryTree(TreeNode input) {
        this.input = input;
    }

    public int solution() {
        return dfs(input, input.val);
    }

    private int dfs(TreeNode node, int currMax) {
        if (node != null) {
            int l = dfs(node.left, Math.max(node.val, currMax));
            int r = dfs(node.right, Math.max(node.val, currMax));
            return (node.val >= currMax ? 1 : 0) + l + r;
        }
        return 0;
    }

}
