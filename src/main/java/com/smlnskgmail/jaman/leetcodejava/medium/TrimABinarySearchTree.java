package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/trim-a-binary-search-tree
public class TrimABinarySearchTree {

    private final TreeNode root;
    private final int low;
    private final int high;

    public TrimABinarySearchTree(TreeNode root, int low, int high) {
        this.root = root;
        this.low = low;
        this.high = high;
    }

    public TreeNode solution() {
        return trimBST(root, low, high);
    }

    private TreeNode trimBST(TreeNode root, int low, int high) {
        if (root != null) {
            if (root.val > high) {
                return trimBST(root.left, low, high);
            }
            if (root.val < low) {
                return trimBST(root.right, low, high);
            }
            root.left = trimBST(root.left, low, high);
            root.right = trimBST(root.right, low, high);
        }
        return root;
    }

}
