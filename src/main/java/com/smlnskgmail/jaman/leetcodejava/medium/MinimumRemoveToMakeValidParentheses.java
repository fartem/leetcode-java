package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

// https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
public class MinimumRemoveToMakeValidParentheses {

    private final String input;

    public MinimumRemoveToMakeValidParentheses(String input) {
        this.input = input;
    }

    public String solution() {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);
            if (!Character.isAlphabetic(curr)) {
                if (curr == '(') {
                    stack.push(i);
                } else {
                    if (!stack.isEmpty() && input.charAt(stack.peek()) == '(') {
                        stack.pop();
                    } else {
                        stack.push(i);
                    }
                }
            }
        }
        StringBuilder result = new StringBuilder();
        Set<Integer> set = new HashSet<>(stack);
        for (int i = 0; i < input.length(); i++) {
            if (!set.contains(i)) {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }

}
