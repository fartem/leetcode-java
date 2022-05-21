package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/sum-of-left-leaves/
public class SumOfLeftLeaves {

    private final TreeNode input;

    public SumOfLeftLeaves(TreeNode input) {
        this.input = input;
    }

    public int solution() {
        return sum(input);
    }

    private int sum(TreeNode root) {
        int sum = 0;
        if (root != null) {
            TreeNode left = root.left;
            if (left != null) {
                if (left.left == null && left.right == null) {
                    sum += left.val;
                } else {
                    sum += sum(left);
                }
            }
            sum += sum(root.right);
        }
        return sum;
    }

}
