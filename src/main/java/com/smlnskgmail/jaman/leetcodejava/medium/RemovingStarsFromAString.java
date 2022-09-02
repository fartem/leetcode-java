package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Stack;

// https://leetcode.com/problems/removing-stars-from-a-string/
public class RemovingStarsFromAString {

    private final String input;

    public RemovingStarsFromAString(String input) {
        this.input = input;
    }

    public String solution() {
        Stack<Character> stack = new Stack<>();
        int p = 0;
        while (p < input.length()) {
            char c = input.charAt(p++);
            if (c == '*') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }

}
