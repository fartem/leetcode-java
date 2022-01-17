package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/smallest-string-starting-from-leaf
public class SmallestStringStartingFromLeaf {

    private final TreeNode input;
    private String result = "~";

    public SmallestStringStartingFromLeaf(TreeNode input) {
        this.input = input;
    }

    public String solution() {
        findSmallestStringStartingFromLeaf(input, "");
        return result;
    }

    private void findSmallestStringStartingFromLeaf(TreeNode root, String curr) {
        if (root != null) {
            char c = (char) (root.val + 97);
            String newCurr = c + curr;
            if (root.left == null && root.right == null) {
                if (result.compareTo(newCurr) > 0) {
                    result = newCurr;
                }
            } else {
                findSmallestStringStartingFromLeaf(root.left, newCurr);
                findSmallestStringStartingFromLeaf(root.right, newCurr);
            }
        }
    }
}
