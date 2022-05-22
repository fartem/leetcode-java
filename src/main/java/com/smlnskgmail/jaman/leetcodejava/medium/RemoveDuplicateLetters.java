package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Stack;

// https://leetcode.com/problems/remove-duplicate-letters/
public class RemoveDuplicateLetters {

    private final String input;

    public RemoveDuplicateLetters(String input) {
        this.input = input;
    }

    public String solution() {
        int[] lastIndices = new int[26];
        for (int i = 0; i < input.length(); i++) {
            lastIndices[input.charAt(i) - 'a'] = i;
        }
        boolean[] seen = new boolean[26];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            int c = input.charAt(i) - 'a';
            if (!seen[c]) {
                while (!stack.isEmpty() && stack.peek() > c && i < lastIndices[stack.peek()]) {
                    seen[stack.pop()] = false;
                }
                stack.push(c);
                seen[c] = true;
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append((char) (stack.pop() + 'a'));
        }
        return result.reverse().toString();
    }

}
