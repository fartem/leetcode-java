package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/find-bottom-left-tree-value
public class FindBottomLeftTreeValue {

    private final TreeNode input;

    private int path = -1;
    private int value;

    public FindBottomLeftTreeValue(TreeNode input) {
        this.input = input;
    }

    public int solution() {
        apply(input, 0);
        return value;
    }

    private void apply(TreeNode node, int curr) {
        if (node == null) {
            return;
        }
        if (path < curr) {
            path = curr;
            value = node.val;
        }
        apply(node.left, curr + 1);
        apply(node.right, curr + 1);
    }

}
