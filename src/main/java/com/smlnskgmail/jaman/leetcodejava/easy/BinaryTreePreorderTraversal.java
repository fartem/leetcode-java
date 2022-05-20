package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-preorder-traversal/
public class BinaryTreePreorderTraversal {

    private final TreeNode input;

    public BinaryTreePreorderTraversal(TreeNode input) {
        this.input = input;
    }

    public List<Integer> solution() {
        List<Integer> result = new ArrayList<>();
        apply(input, result);
        return result;
    }

    private void apply(TreeNode node, List<Integer> nums) {
        if (node == null) {
            return;
        }
        nums.add(node.val);
        apply(node.left, nums);
        apply(node.right, nums);
    }

}
