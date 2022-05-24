package com.smlnskgmail.jaman.leetcodejava.hard;

import java.util.Stack;

// https://leetcode.com/problems/longest-valid-parentheses/
public class LongestValidParentheses {

    private final String input;

    public LongestValidParentheses(String input) {
        this.input = input;
    }

    public int solution() {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    result = Math.max(result, i - stack.peek());
                }
            }
        }
        return result;
    }

}
