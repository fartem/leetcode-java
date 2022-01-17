package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/longest-univalue-path
public class LongestUnivaluePath {

    private final TreeNode input;
    private int result;

    public LongestUnivaluePath(TreeNode input) {
        this.input = input;
    }

    public int solution() {
        findPath(input);
        return result;
    }

    private int findPath(TreeNode node) {
        if (node != null) {
            int arrowLeft = 0;
            int left = findPath(node.left);
            if (node.left != null && node.left.val == node.val) {
                arrowLeft += left + 1;
            }
            int arrowRight = 0;
            int right = findPath(node.right);
            if (node.right != null && node.right.val == node.val) {
                arrowRight += right + 1;
            }
            result = Math.max(result, arrowLeft + arrowRight);
            return Math.max(arrowLeft, arrowRight);
        }
        return 0;
    }
}
