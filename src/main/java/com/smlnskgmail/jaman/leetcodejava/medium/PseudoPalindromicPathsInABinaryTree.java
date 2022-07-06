package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/
public class PseudoPalindromicPathsInABinaryTree {

    private final TreeNode input;

    public PseudoPalindromicPathsInABinaryTree(TreeNode input) {
        this.input = input;
    }

    public int solution() {
        return find(input, 0);
    }

    private int find(TreeNode node, int freq) {
        if (node == null) {
            return 0;
        }
        freq = freq ^ (1 << node.val);
        if (node.left == null && node.right == null) {
            return (freq & (freq - 1)) == 0 ? 1 : 0;
        }
        return find(node.left, freq) + find(node.right, freq);
    }

}
