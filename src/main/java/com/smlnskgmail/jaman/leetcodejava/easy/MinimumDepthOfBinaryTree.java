package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/minimum-depth-of-binary-tree
public class MinimumDepthOfBinaryTree {

    private final TreeNode input;

    public MinimumDepthOfBinaryTree(TreeNode input) {
        this.input = input;
    }

    public int solution() {
        return minDepth(input);
    }

    private int minDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        } else if (node.left == null) {
            return minDepth(node.right) + 1;
        } else if (node.right == null) {
            return minDepth(node.left) + 1;
        }
        return Math.min(minDepth(node.left) + 1, minDepth(node.right) + 1);
    }
}
