package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Stack;

// https://leetcode.com/problems/make-the-string-great/
public class MakeTheStringGreat {

    private final String input;

    public MakeTheStringGreat(String input) {
        this.input = input;
    }

    public String solution() {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!stack.isEmpty() && Math.abs(stack.peek() - c) == 32) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        char[] result = new char[stack.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.get(i);
        }
        return new String(result);
    }

}
