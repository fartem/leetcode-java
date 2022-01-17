package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/kth-smallest-element-in-a-bst
public class KthSmallestElementInABST {

    private final TreeNode root;
    private final int k;

    public KthSmallestElementInABST(TreeNode root, int k) {
        this.root = root;
        this.k = k;
    }

    public int solution() {
        List<Integer> nums = new ArrayList<>();
        apply(root, nums);
        return nums.get(k - 1);
    }

    private void apply(TreeNode node, List<Integer> nums) {
        if (node == null) {
            return;
        }
        apply(node.left, nums);
        nums.add(node.val);
        apply(node.right, nums);
    }
}
