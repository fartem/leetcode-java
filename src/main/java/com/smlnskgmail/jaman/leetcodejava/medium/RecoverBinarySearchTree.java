package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/recover-binary-search-tree
public class RecoverBinarySearchTree {

    private final TreeNode input;

    public RecoverBinarySearchTree(TreeNode input) {
        this.input = input;
    }

    public void solution() {
        List<TreeNode> nodes = new ArrayList<>();
        traverse(input, nodes);
        TreeNode first = null;
        for (int i = 0; i < nodes.size() - 1; i++) {
            TreeNode curr = nodes.get(i);
            TreeNode next = nodes.get(i + 1);
            if (next.val < curr.val) {
                first = next;
            }
        }
        TreeNode second = nodes.get(0);
        for (int i = 1; i < nodes.size(); i++) {
            TreeNode prev = nodes.get(i - 1);
            TreeNode curr = nodes.get(i);
            if (prev.val < first.val && first.val < curr.val) {
                second = curr;
                break;
            }
        }
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void traverse(TreeNode root, List<TreeNode> nodes) {
        if (root != null) {
            traverse(root.left, nodes);
            nodes.add(root);
            traverse(root.right, nodes);
        }
    }

}
