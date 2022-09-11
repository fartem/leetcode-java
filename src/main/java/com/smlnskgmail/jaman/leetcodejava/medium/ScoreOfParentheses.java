package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Stack;

// https://leetcode.com/problems/score-of-parentheses/
public class ScoreOfParentheses {

    private final String input;

    public ScoreOfParentheses(String input) {
        this.input = input;
    }

    public int solution() {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(') {
                stack.push(0);
            } else {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b + Math.max(2 * a, 1));
            }
        }
        return stack.pop();
    }

}
