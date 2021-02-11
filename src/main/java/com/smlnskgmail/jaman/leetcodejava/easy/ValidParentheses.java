package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses
public class ValidParentheses {

    private final String input;

    public ValidParentheses(String input) {
        this.input = input;
    }

    public boolean solution() {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.empty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '{':
                    stack.push(c);
                    break;
                case '}':
                    if (stack.empty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case '[':
                    stack.push(c);
                    break;
                case ']':
                    if (stack.empty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
            }
        }
        return stack.empty();
    }

}
