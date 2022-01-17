package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses
public class MaximumNestingDepthOfTheParentheses {

    private final String input;

    public MaximumNestingDepthOfTheParentheses(String input) {
        this.input = input;
    }

    public int solution() {
        int current = 0;
        int max = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(') {
                current++;
                if (current > max) {
                    max = current;
                }
            } else if (c == ')') {
                current--;
            }
        }
        return max;
    }
}
