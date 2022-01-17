package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

public class IncreasingOrderSearchTree {

    private final TreeNode root;
    private TreeNode curr;

    public IncreasingOrderSearchTree(TreeNode root) {
        this.root = root;
    }

    public TreeNode solution() {
        TreeNode result = new TreeNode();
        curr = result;
        inorder(root);
        return result.right;
    }

    private void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        node.left = null;
        curr.right = node;
        curr = node;
        inorder(node.right);
    }
}
