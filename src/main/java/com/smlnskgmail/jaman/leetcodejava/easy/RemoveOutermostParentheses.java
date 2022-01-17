package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/remove-outermost-parentheses
public class RemoveOutermostParentheses {

    private final String input;

    public RemoveOutermostParentheses(String input) {
        this.input = input;
    }

    public String solution() {
        StringBuilder result = new StringBuilder();
        int pointer = 0;
        while (pointer < input.length()) {
            int startAt = ++pointer;
            int counter = 1;
            while (counter != 0) {
                char c = input.charAt(pointer++);
                counter += c == '(' ? 1 : -1;
            }
            result.append(input, startAt, pointer - 1);
        }
        return result.toString();
    }
}
