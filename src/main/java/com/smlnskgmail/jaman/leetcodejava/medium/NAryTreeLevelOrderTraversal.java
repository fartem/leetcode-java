package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// https://leetcode.com/problems/n-ary-tree-level-order-traversal/
public class NAryTreeLevelOrderTraversal {

    private final Node input;

    public NAryTreeLevelOrderTraversal(Node input) {
        this.input = input;
    }

    public List<List<Integer>> solution() {
        List<List<Integer>> result = new ArrayList<>();
        if (input == null) {
            return result;
        }
        Deque<Node> queue = new ArrayDeque<>();
        queue.addLast(input);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = size; i > 0; i--) {
                Node node = queue.removeFirst();
                level.add(node.val);
                for (Node child : node.children) {
                    queue.addLast(child);
                }
            }
            result.add(level);
        }
        return result;
    }

}
