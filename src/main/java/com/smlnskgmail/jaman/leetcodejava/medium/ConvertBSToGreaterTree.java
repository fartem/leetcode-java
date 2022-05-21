package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/convert-bst-to-greater-tree/
public class ConvertBSToGreaterTree {

    private final TreeNode input;

    private int sum;

    public ConvertBSToGreaterTree(TreeNode input) {
        this.input = input;
    }

    public TreeNode solution() {
        return convertBST(input);
    }

    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }
}
