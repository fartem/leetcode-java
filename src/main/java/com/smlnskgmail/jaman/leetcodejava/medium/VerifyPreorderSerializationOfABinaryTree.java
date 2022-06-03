package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Stack;

// https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/
public class VerifyPreorderSerializationOfABinaryTree {

    private final String input;

    public VerifyPreorderSerializationOfABinaryTree(String input) {
        this.input = input;
    }

    public boolean solution() {
        Stack<String> stack = new Stack<>();
        String[] tree = input.split(",");
        for (String node : tree) {
            while (node.equals("#") && !stack.isEmpty() && stack.peek().equals("#")) {
                stack.pop();
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
            stack.push(node);
        }
        return stack.size() == 1 && stack.peek().equals("#");
    }

}
