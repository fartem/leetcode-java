package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree
public class ConvertSortedArrayToBinarySearchTree {

    private final int[] input;

    public ConvertSortedArrayToBinarySearchTree(int[] input) {
        this.input = input;
    }

    public TreeNode solution() {
        return toBST(input, 0, input.length - 1);
    }

    private TreeNode toBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int middle = (start + end) / 2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = toBST(nums, start, middle - 1);
        node.right = toBST(nums, middle + 1, end);
        return node;
    }
}
