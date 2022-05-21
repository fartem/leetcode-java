package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/path-sum/
public class PathSum {

    private final TreeNode root;
    private final int targetSum;

    public PathSum(TreeNode root, int targetSum) {
        this.root = root;
        this.targetSum = targetSum;
    }

    public boolean solution() {
        return sum(root, targetSum, 0);
    }

    private boolean sum(TreeNode node, int targetSum, int count) {
        if (node == null) {
            return false;
        }
        if (node.left == null && node.right == null) {
            return node.val + count == targetSum;
        }
        return sum(node.left, targetSum, node.val + count)
                || sum(node.right, targetSum, node.val + count);
    }

}
