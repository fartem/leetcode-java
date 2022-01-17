package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree
public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {

    private final TreeNode original;
    private final TreeNode cloned;
    private final TreeNode target;

    public FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree(
            TreeNode original, TreeNode cloned, TreeNode target) {
        this.original = original;
        this.cloned = cloned;
        this.target = target;
    }

    public TreeNode solution() {
        return find(cloned, target.val);
    }

    public TreeNode find(TreeNode node, int value) {
        if (node != null) {
            if (node.val == value) {
                return node;
            }
            TreeNode left = find(node.left, value);
            if (left != null && left.val == value) {
                return left;
            }
            TreeNode right = find(node.right, value);
            if (right != null && right.val == value) {
                return right;
            }
        }
        return null;
    }
}
