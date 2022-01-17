package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/balance-a-binary-search-tree
public class BalanceABinarySearchTree {

    private final TreeNode input;

    public BalanceABinarySearchTree(TreeNode input) {
        this.input = input;
    }

    public TreeNode solution() {
        List<Integer> nums = new ArrayList<>();
        dfs(input, nums);
        return build(nums, 0, nums.size() - 1);
    }

    private void dfs(TreeNode node, List<Integer> nums) {
        if (node != null) {
            dfs(node.left, nums);
            nums.add(node.val);
            dfs(node.right, nums);
        }
    }

    private TreeNode build(List<Integer> nums, int l, int r) {
        if (l > r) {
            return null;
        }
        int m = l + (r - l) / 2;
        TreeNode node = new TreeNode(nums.get(m));
        node.left = build(nums, l, m - 1);
        node.right = build(nums, m + 1, r);
        return node;
    }
}
