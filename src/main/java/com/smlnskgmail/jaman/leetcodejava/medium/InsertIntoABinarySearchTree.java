package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/insert-into-a-binary-search-tree
public class InsertIntoABinarySearchTree {

    private final TreeNode root;
    private final int val;

    public InsertIntoABinarySearchTree(TreeNode root, int val) {
        this.root = root;
        this.val = val;
    }

    public TreeNode solution() {
        return insertIntoBST(root, val);
    }

    private TreeNode insertIntoBST(TreeNode root, int val) {
        if (root != null) {
            if (val < root.val) {
                root.left = insertIntoBST(root.left, val);
            } else {
                root.right = insertIntoBST(root.right, val);
            }
            return root;
        }
        return new TreeNode(val);
    }

}
