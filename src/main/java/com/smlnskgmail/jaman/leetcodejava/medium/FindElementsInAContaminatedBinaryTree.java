package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree
public class FindElementsInAContaminatedBinaryTree {

    private final Set<Integer> values = new HashSet<>();

    public FindElementsInAContaminatedBinaryTree(TreeNode input) {
        input.val = 0;
        recover(input);
    }

    private void recover(TreeNode node) {
        if (node != null) {
            values.add(node.val);
            if (node.left != null) {
                node.left.val = 2 * node.val + 1;
                recover(node.left);
            }
            if (node.right != null) {
                node.right.val = 2 * node.val + 2;
                recover(node.right);
            }
        }
    }

    public boolean find(int target) {
        return values.contains(target);
    }
}
