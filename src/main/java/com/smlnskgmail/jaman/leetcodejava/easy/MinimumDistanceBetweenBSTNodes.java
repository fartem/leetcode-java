package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/minimum-distance-between-bst-nodes
public class MinimumDistanceBetweenBSTNodes {

    private final TreeNode input;

    public MinimumDistanceBetweenBSTNodes(TreeNode input) {
        this.input = input;
    }

    public int solution() {
        List<Integer> nums = new ArrayList<>();
        apply(input, nums);
        int result = Integer.MAX_VALUE;
        for (int i = 1; i < nums.size(); i++) {
            int diff = nums.get(i) - nums.get(i - 1);
            if (diff < result) {
                result = diff;
            }
        }
        return result;
    }

    private void apply(TreeNode node, List<Integer> nums) {
        if (node == null) {
            return;
        }
        apply(node.left, nums);
        nums.add(node.val);
        apply(node.right, nums);
    }

}
