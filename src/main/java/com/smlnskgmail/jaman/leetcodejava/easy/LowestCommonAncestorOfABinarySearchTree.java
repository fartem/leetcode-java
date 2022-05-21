package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
public class LowestCommonAncestorOfABinarySearchTree {

    private final TreeNode root;
    private final TreeNode p;
    private final TreeNode q;

    public LowestCommonAncestorOfABinarySearchTree(
            TreeNode root,
            TreeNode p,
            TreeNode q
    ) {
        this.root = root;
        this.p = p;
        this.q = q;
    }

    public TreeNode solution() {
        return lowestCommonAncestor(root, p, q);
    }

    private TreeNode lowestCommonAncestor(
            TreeNode root,
            TreeNode p,
            TreeNode q
    ) {
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

}
