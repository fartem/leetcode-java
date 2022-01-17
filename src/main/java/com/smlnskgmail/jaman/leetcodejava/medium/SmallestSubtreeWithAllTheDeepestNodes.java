package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes
public class SmallestSubtreeWithAllTheDeepestNodes {

    private final TreeNode input;

    public SmallestSubtreeWithAllTheDeepestNodes(TreeNode input) {
        this.input = input;
    }

    public TreeNode solution() {
        int depth = depth(input);
        return dfs(input, depth);
    }

    private int depth(TreeNode node) {
        if (node != null) {
            int left = depth(node.left);
            int right = depth(node.right);
            return 1 + Math.max(left, right);
        }
        return 0;
    }

    private TreeNode dfs(TreeNode node, int depth) {
        if (node != null) {
            if (depth == 1) {
                return node;
            }
            TreeNode left = dfs(node.left, depth - 1);
            TreeNode right = dfs(node.right, depth - 1);
            if (left != null && right != null) {
                return node;
            }
            return left != null ? left : right;
        }
        return null;
    }
}
