package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/range-sum-of-bst
public class RangeSumOfBST {

    private final TreeNode root;
    private final int low;
    private final int high;

    public RangeSumOfBST(TreeNode root, int low, int high) {
        this.root = root;
        this.low = low;
        this.high = high;
    }

    public int solution() {
        return count(root, low, high);
    }

    private int count(TreeNode head, int low, int high) {
        if (head == null) {
            return 0;
        }
        if (head.val >= low && head.val <= high) {
            return head.val
                    + count(head.left, low, high)
                    + count(head.right, low, high);
        } else if (head.val < low) {
            return count(head.right, low, high);
        } else {
            return count(head.left, low, high);
        }
    }

}
