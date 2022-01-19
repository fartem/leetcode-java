package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

// https://leetcode.com/problems/maximum-width-of-binary-tree
public class MaximumWidthOfBinaryTree {

    private final TreeNode input;

    public MaximumWidthOfBinaryTree(TreeNode input) {
        this.input = input;
    }

    public int solution() {
        int result = 1;
        Deque<TreeNodePair> nodes = new LinkedList<>();
        nodes.add(new TreeNodePair(input, 0));
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNodePair pair = nodes.removeFirst();
                min = Math.min(min, pair.value);
                max = Math.max(max, pair.value);
                if (pair.node.left != null) {
                    nodes.addLast(
                            new TreeNodePair(
                                    pair.node.left,
                                    pair.value * 2 + 1
                            )
                    );
                }
                if (pair.node.right != null) {
                    nodes.addLast(
                            new TreeNodePair(
                                    pair.node.right,
                                    pair.value * 2 + 2
                            )
                    );
                }
            }
            result = Math.max(result, max - min + 1);
        }
        return result;
    }

    private static class TreeNodePair {
        final TreeNode node;
        final int value;

        private TreeNodePair(TreeNode node, int value) {
            this.node = node;
            this.value = value;
        }
    }

}
