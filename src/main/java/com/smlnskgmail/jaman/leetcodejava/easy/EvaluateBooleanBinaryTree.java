package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/evaluate-boolean-binary-tree/
public class EvaluateBooleanBinaryTree {

    private final TreeNode input;

    public EvaluateBooleanBinaryTree(TreeNode input) {
        this.input = input;
    }

    public boolean solution() {
        return evaluateTree(input);
    }

    private boolean evaluateTree(TreeNode root) {
        switch (root.val) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return evaluateTree(root.left) || evaluateTree(root.right);
            default:
                return evaluateTree(root.left) && evaluateTree(root.right);
        }
    }

}
