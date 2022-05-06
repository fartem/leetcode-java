package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Stack;

// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii
public class RemoveAllAdjacentDuplicatesInStringII {

    private final String s;
    private final int k;

    public RemoveAllAdjacentDuplicatesInStringII(String s, int k) {
        this.s = s;
        this.k = k;
    }

    public String solution() {
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty() && c == stack.peek()[0]) {
                int[] curr = stack.peek();
                if (curr[1] == k - 1) {
                    stack.pop();
                } else {
                    curr[1]++;
                }
            } else {
                stack.push(new int[]{c, 1});
            }
        }
        StringBuilder result = new StringBuilder();
        for (int[] count : stack) {
            result.append(String.valueOf((char) count[0]).repeat(count[1]));
        }
        return result.toString();
    }

}
