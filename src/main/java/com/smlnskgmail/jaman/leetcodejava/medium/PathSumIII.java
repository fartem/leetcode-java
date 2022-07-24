package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/path-sum-iii/
public class PathSumIII {

    private final TreeNode root;
    private final int targetSum;

    public PathSumIII(TreeNode root, int targetSum) {
        this.root = root;
        this.targetSum = targetSum;
    }

    public int solution() {
        return pathSum(root, targetSum);
    }

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        return traverse(root, targetSum)
                + pathSum(root.left, targetSum)
                + pathSum(root.right, targetSum);
    }

    private int traverse(TreeNode node, long targetSum) {
        if (node == null) {
            return 0;
        }
        int result = 0;
        if (targetSum == node.val) {
            result++;
        }
        result += traverse(node.left, targetSum - node.val)
                + traverse(node.right, targetSum - node.val);
        return result;
    }

}
