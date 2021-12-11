package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/maximum-binary-tree
public class MaximumBinaryTree {

    private final int[] input;

    public MaximumBinaryTree(int[] input) {
        this.input = input;
    }

    public TreeNode solution() {
        return construct(input, 0, input.length);
    }

    private TreeNode construct(int[] nums, int l, int r) {
        if (l == r) {
            return null;
        }
        int max = max(nums, l, r);
        TreeNode root = new TreeNode(nums[max]);
        root.left = construct(nums, l, max);
        root.right = construct(nums, max + 1, r);
        return root;
    }

    private int max(int[] nums, int l, int r) {
        int max = l;
        for (int i = l; i < r; i++) {
            if (nums[max] < nums[i]) {
                max = i;
            }
        }
        return max;
    }

}
