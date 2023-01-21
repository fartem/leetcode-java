package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/reverse-odd-levels-of-binary-tree/
public class ReverseOddLevelsOfBinaryTree {

    private final TreeNode input;

    public ReverseOddLevelsOfBinaryTree(TreeNode input) {
        this.input = input;
    }

    public TreeNode solution() {
        traverse(input.left, input.right, 1);
        return input;
    }

    private void traverse(TreeNode l, TreeNode r, int level) {
        if (l == null || r == null) {
            return;
        }
        if (level % 2 == 1) {
            int temp = l.val;
            l.val = r.val;
            r.val = temp;
        }
        traverse(l.left, r.right, level + 1);
        traverse(l.right, r.left, level + 1);
    }

}
