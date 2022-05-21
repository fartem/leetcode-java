package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
public class BinarySearchTreeToGreaterSumTree {

    private final TreeNode input;

    private int sum = 0;

    public BinarySearchTreeToGreaterSumTree(TreeNode input) {
        this.input = input;
    }

    public TreeNode solution() {
        transformTree(input);
        return input;
    }

    private void transformTree(TreeNode node) {
        if (node != null) {
            transformTree(node.right);
            sum += node.val;
            node.val = sum;
            transformTree(node.left);
        }
    }

}
