package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/delete-node-in-a-bst
public class DeleteNodeInABST {

    private final TreeNode root;
    private final int key;

    public DeleteNodeInABST(TreeNode root, int key) {
        this.root = root;
        this.key = key;
    }

    public TreeNode solution() {
        return deleteNode(root, key);
    }

    private TreeNode deleteNode(TreeNode root, int key) {
        if (root != null) {
            if (key > root.val) {
                root.right = deleteNode(root.right, key);
            } else if (key < root.val) {
                root.left = deleteNode(root.left, key);
            } else {
                if (root.left == null && root.right == null) {
                    root = null;
                } else if (root.right != null) {
                    root.val = successor(root);
                    root.right = deleteNode(root.right, root.val);
                } else {
                    root.val = predecessor(root);
                    root.left = deleteNode(root.left, root.val);
                }
            }
            return root;
        }
        return null;
    }

    private int successor(TreeNode node) {
        node = node.right;
        while (node.left != null) {
            node = node.left;
        }
        return node.val;
    }

    private int predecessor(TreeNode node) {
        node = node.left;
        while (node.right != null) {
            node = node.right;
        }
        return node.val;
    }

}
