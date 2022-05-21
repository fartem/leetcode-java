package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Stack;

// https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/
public class SmallestSubsequenceOfDistinctCharacters {

    private final String s;

    public SmallestSubsequenceOfDistinctCharacters(String input) {
        this.s = input;
    }

    public String solution() {
        int[] lastIndices = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndices[s.charAt(i) - 'a'] = i;
        }
        boolean[] seen = new boolean[26];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
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
