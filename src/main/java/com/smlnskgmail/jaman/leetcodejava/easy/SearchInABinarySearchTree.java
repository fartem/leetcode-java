package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/search-in-a-binary-search-tree
public class SearchInABinarySearchTree {

    private final TreeNode root;
    private final int val;

    public SearchInABinarySearchTree(
            TreeNode root,
            int val
    ) {
        this.root = root;
        this.val = val;
    }

    public TreeNode solution() {
        return search(root, val);
    }

    private TreeNode search(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        TreeNode left = search(root.left, val);
        TreeNode right = search(root.right, val);
        if (left != null) {
            return left;
        }
        return right;
    }

}
