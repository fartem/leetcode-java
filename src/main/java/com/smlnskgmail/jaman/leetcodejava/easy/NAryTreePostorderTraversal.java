package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.Node;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

// https://leetcode.com/problems/n-ary-tree-postorder-traversal/
public class NAryTreePostorderTraversal {

    private final Node input;

    public NAryTreePostorderTraversal(Node input) {
        this.input = input;
    }

    public List<Integer> solution() {
        if (input == null) {
            return Collections.emptyList();
        }
        LinkedList<Integer> result = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(input);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            result.addFirst(node.val);
            if (node.children != null) {
                for (Node child : node.children) {
                    stack.push(child);
                }
            }
        }
        return result;
    }

}
