package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/merge-two-binary-trees/
public class MergeTwoBinaryTrees {

    private final TreeNode root1;
    private final TreeNode root2;

    public MergeTwoBinaryTrees(TreeNode root1, TreeNode root2) {
        this.root1 = root1;
        this.root2 = root2;
    }

    public TreeNode solution() {
        return merge(root1, root2);
    }

    private TreeNode merge(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        root1.val += root2.val;
        root1.left = merge(root1.left, root2.left);
        root1.right = merge(root1.right, root2.right);
        return root1;
    }

}
