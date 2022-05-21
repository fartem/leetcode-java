package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
public class MinimumAddToMakeParenthesesValid {

    private final String input;

    public MinimumAddToMakeParenthesesValid(String input) {
        this.input = input;
    }

    public int solution() {
        int o = 0;
        int c = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ')') {
                if (o == 0) {
                    c++;
                } else {
                    o--;
                }
            } else {
                o++;
            }
        }
        return o + c;
    }

}
