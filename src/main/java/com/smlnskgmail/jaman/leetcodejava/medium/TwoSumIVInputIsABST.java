package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
public class TwoSumIVInputIsABST {

    private final TreeNode root;
    private final int k;

    public TwoSumIVInputIsABST(TreeNode root, int k) {
        this.root = root;
        this.k = k;
    }

    public boolean solution() {
        return contains(root, new HashSet<>(), k);
    }

    private boolean contains(TreeNode node, Set<Integer> nums, int k) {
        if (node == null) {
            return false;
        }
        int diff = k - node.val;
        if (nums.contains(diff)) {
            return true;
        }
        nums.add(node.val);
        return contains(node.left, nums, k) || contains(node.right, nums, k);
    }

}
