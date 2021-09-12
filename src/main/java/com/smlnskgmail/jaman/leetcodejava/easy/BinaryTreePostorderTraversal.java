package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-postorder-traversal
public class BinaryTreePostorderTraversal {

    private final TreeNode input;

    public BinaryTreePostorderTraversal(TreeNode input) {
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
        apply(node.left, nums);
        apply(node.right, nums);
        nums.add(node.val);
    }

}
