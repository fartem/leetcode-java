package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-inorder-traversal/
public class BinaryTreeInorderTraversal {

    private final TreeNode input;

    public BinaryTreeInorderTraversal(TreeNode input) {
        this.input = input;
    }

    public List<Integer> solution() {
        List<Integer> values = new ArrayList<>();
        apply(input, values);
        return values;
    }

    private void apply(TreeNode node, List<Integer> values) {
        if (node == null) {
            return;
        }
        apply(node.left, values);
        values.add(node.val);
        apply(node.right, values);
    }

}
