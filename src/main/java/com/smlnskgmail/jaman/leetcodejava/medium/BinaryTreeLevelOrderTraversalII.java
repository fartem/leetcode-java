package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.*;

// https://leetcode.com/problems/binary-tree-level-order-traversal-ii
public class BinaryTreeLevelOrderTraversalII {

    private final TreeNode input;

    public BinaryTreeLevelOrderTraversalII(TreeNode input) {
        this.input = input;
    }

    public List<List<Integer>> solution() {
        List<List<Integer>> result = new ArrayList<>();
        if (input == null) {
            return result;
        }
        Deque<TreeNode> deq = new ArrayDeque<>();
        deq.add(input);
        while (!deq.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = deq.size();
            for (int i = size; i > 0; i--) {
                TreeNode node = deq.removeFirst();
                level.add(node.val);
                if (node.left != null) {
                    deq.add(node.left);
                }
                if (node.right != null) {
                    deq.add(node.right);
                }
            }
            result.add(level);
        }
        Collections.reverse(result);
        return result;
    }

}
