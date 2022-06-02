package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/count-complete-tree-nodes/
public class CountCompleteTreeNodes {

    private final TreeNode input;

    public CountCompleteTreeNodes(TreeNode input) {
        this.input = input;
    }

    public int solution() {
        return countNodes(input);
    }

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

}
