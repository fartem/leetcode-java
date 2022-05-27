package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
public class LowestCommonAncestorOfABinaryTree {

    private final TreeNode root;
    private final TreeNode p;
    private final TreeNode q;

    private TreeNode result;

    public LowestCommonAncestorOfABinaryTree(TreeNode root, TreeNode p, TreeNode q) {
        this.root = root;
        this.p = p;
        this.q = q;
    }

    public TreeNode solution() {
        recurseTree(root, p, q);
        return result;
    }

    private boolean recurseTree(TreeNode curr, TreeNode p, TreeNode q) {
        if (curr == null) {
            return false;
        }
        int left = recurseTree(curr.left, p, q) ? 1 : 0;
        int right = recurseTree(curr.right, p, q) ? 1 : 0;
        int mid = (curr == p || curr == q) ? 1 : 0;
        if (left + right + mid >= 2) {
            result = curr;
        }
        return left + right + mid > 0;
    }

}
