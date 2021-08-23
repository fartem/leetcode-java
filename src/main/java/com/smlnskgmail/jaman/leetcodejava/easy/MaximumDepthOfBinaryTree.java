package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/maximum-depth-of-binary-tree
public class MaximumDepthOfBinaryTree {

    private final TreeNode input;

    public MaximumDepthOfBinaryTree(TreeNode input) {
        this.input = input;
    }

    public int solution() {
        return count(input);
    }

    private int count(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = count(root.left);
        int right = count(root.right);
        if (left > right) {
            return left + 1;
        }
        return right + 1;
    }

}
