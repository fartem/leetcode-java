package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/delete-leaves-with-a-given-value
public class DeleteLeavesWithAGivenValue {

    private final TreeNode input;
    private final int target;

    public DeleteLeavesWithAGivenValue(TreeNode input, int target) {
        this.input = input;
        this.target = target;
    }

    public TreeNode solution() {
        return removeLeafNodes(input, target);
    }

    private TreeNode removeLeafNodes(TreeNode node, int target) {
        if (node != null) {
            node.left = removeLeafNodes(node.left, target);
            node.right = removeLeafNodes(node.right, target);
            if (node.val == target && node.left == null && node.right == null) {
                return null;
            }
            return node;
        }
        return null;
    }
}
