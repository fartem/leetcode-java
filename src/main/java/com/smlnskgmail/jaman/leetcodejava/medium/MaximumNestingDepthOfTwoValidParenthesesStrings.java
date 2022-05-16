package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/maximum-nesting-depth-of-two-valid-parentheses-strings
public class MaximumNestingDepthOfTwoValidParenthesesStrings {

    private final String seq;

    public MaximumNestingDepthOfTwoValidParenthesesStrings(String input) {
        this.seq = input;
    }

    public int[] solution() {
        int[] result = new int[seq.length()];
        for (int i = 0; i < seq.length(); i++) {
            char curr = seq.charAt(i);
            result[i] = curr == '(' ? i & 1 : 1 - i & 1;
        }
        return result;
    }

}
