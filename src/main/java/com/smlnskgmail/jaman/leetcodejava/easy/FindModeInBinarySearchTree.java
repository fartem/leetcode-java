package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-mode-in-binary-search-tree/
public class FindModeInBinarySearchTree {

    private final TreeNode input;

    private int prev = -1;
    private int count = 1;
    private int max;

    public FindModeInBinarySearchTree(TreeNode input) {
        this.input = input;
    }

    public int[] solution() {
        List<Integer> modes = new ArrayList<>();
        traverse(input, modes);
        int[] result = new int[modes.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = modes.get(i);
        }
        return result;
    }

    private void traverse(TreeNode node, List<Integer> modes) {
        if (node == null) {
            return;
        }
        traverse(node.left, modes);
        if (prev != -1) {
            if (prev == node.val) {
                count++;
            } else {
                count = 1;
            }
        }
        if (count > max) {
            max = count;
            modes.clear();
            modes.add(node.val);
        } else if (count == max) {
            modes.add(node.val);
        }
        prev = node.val;
        traverse(node.right, modes);
    }

}
