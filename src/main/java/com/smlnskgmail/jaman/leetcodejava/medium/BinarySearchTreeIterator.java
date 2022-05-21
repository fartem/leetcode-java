package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-search-tree-iterator/
public class BinarySearchTreeIterator {

    private final List<Integer> values = new ArrayList<>();
    private int pointer = 0;

    public BinarySearchTreeIterator(TreeNode root) {
        traverse(root);
    }

    private void traverse(TreeNode node) {
        if (node != null) {
            traverse(node.left);
            values.add(node.val);
            traverse(node.right);
        }
    }

    public int next() {
        return values.get(pointer++);
    }

    public boolean hasNext() {
        return pointer < values.size();
    }

}
