package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.*;

// https://leetcode.com/problems/find-largest-value-in-each-tree-row/
public class FindLargestValueInEachTreeRow {

    private final TreeNode input;

    public FindLargestValueInEachTreeRow(TreeNode input) {
        this.input = input;
    }

    public List<Integer> solution() {
        if (input == null) {
            return Collections.emptyList();
        }
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(input);
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode node = nodes.poll();
                if (node.val > max) {
                    max = node.val;
                }
                if (node.left != null) {
                    nodes.add(node.left);
                }
                if (node.right != null) {
                    nodes.add(node.right);
                }
            }
            result.add(max);
        }
        return result;
    }

}
