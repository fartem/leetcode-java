package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/path-sum-iii/
public class PathSumIII {

    private final TreeNode root;
    private final int targetSum;

    public PathSumIII(TreeNode root, int targetSum) {
        this.root = root;
        this.targetSum = targetSum;
    }

    public int solution() {
        Map<Integer, Integer> values = new HashMap<>();
        values.put(0, 1);
        return calculateCount(root, targetSum, 0, values);
    }

    private int calculateCount(
            TreeNode node,
            int targetSum,
            int sum,
            Map<Integer, Integer> values
    ) {
        int result = 0;
        if (node == null) {
            return result;
        }
        sum += node.val;
        if (values.containsKey(sum - targetSum)) {
            result += values.get(sum - targetSum);
        }
        values.put(sum, values.getOrDefault(sum, 0) + 1);
        result += calculateCount(node.left, targetSum, sum, values);
        result += calculateCount(node.right, targetSum, sum, values);
        values.put(sum, values.getOrDefault(sum, 0) - 1);
        return result;
    }

}
