package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
public class FlattenBinaryTreeToLinkedList {

    private final TreeNode input;

    public FlattenBinaryTreeToLinkedList(TreeNode input) {
        this.input = input;
    }

    public void solution() {
        fillValues(input);
    }

    private void fillValues(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            return;
        }
        if (root.left != null) {
            fillValues(root.left);
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = null;

            TreeNode tail = root.right;
            while (tail.right != null) {
                tail = tail.right;
            }
            tail.right = temp;
        }
        fillValues(root.right);
    }

}
