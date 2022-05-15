package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree
public class CountNodesEqualToAverageOfSubtree {

    private final TreeNode root;
    private int result;

    public CountNodesEqualToAverageOfSubtree(TreeNode input) {
        this.root = input;
    }

    public int solution() {
        dfs(root);
        return result;
    }

    private int[] dfs(TreeNode node) {
        if (node == null) {
            return new int[2];
        }
        int[] left = dfs(node.left);
        int[] right = dfs(node.right);
        int currSum = left[0] + right[0] + node.val;
        int currCount = left[1] + right[1] + 1;
        if (currSum / currCount == node.val) {
            result++;
        }
        return new int[]{currSum, currCount};
    }

}
