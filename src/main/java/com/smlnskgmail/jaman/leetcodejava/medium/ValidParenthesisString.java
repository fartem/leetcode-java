package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/valid-parenthesis-string/
public class ValidParenthesisString {

    private final String input;

    public ValidParenthesisString(String input) {
        this.input = input;
    }

    public boolean solution() {
        int l = 0;
        int h = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            l += c == '(' ? 1 : -1;
            h += c != ')' ? 1 : -1;
            if (h < 0) {
                break;
            }
            l = Math.max(l, 0);
        }
        return l == 0;
    }

}
