package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.*;

// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal
public class BinaryTreeZigzagLevelOrderTraversal {

    private final TreeNode input;

    public BinaryTreeZigzagLevelOrderTraversal(TreeNode input) {
        this.input = input;
    }

    public List<List<Integer>> solution() {
        List<List<Integer>> result = new ArrayList<>();
        if (input == null) {
            return result;
        }
        Deque<TreeNode> deq = new ArrayDeque<>();
        deq.add(input);
        boolean rev = true;
        while (!deq.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = deq.size();
            rev = !rev;
            for (int i = size; i > 0; i--) {
                TreeNode node = deq.removeFirst();
                level.add(node.val);
                TreeNode left = node.left;
                TreeNode right = node.right;
                if (left != null) {
                    deq.addLast(left);
                }
                if (right != null) {
                    deq.addLast(right);
                }
            }
            if (rev) {
                Collections.reverse(level);
            }
            result.add(level);
        }
        return result;
    }

}
