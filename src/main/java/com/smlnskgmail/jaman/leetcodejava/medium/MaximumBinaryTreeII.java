package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/maximum-binary-tree-ii/
public class MaximumBinaryTreeII {

    private final TreeNode root;
    private final int val;

    public MaximumBinaryTreeII(TreeNode root, int val) {
        this.root = root;
        this.val = val;
    }

    public TreeNode solution() {
        return insertIntoMaxTree(root, val);
    }

    private TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val < val) {
            var node = new TreeNode(val);
            node.left = root;
            return node;
        } else {
            if (root.right != null) {
                root.right = insertIntoMaxTree(root.right, val);
            } else {
                root.right = new TreeNode(val);
            }
        }
        return root;
    }

}
