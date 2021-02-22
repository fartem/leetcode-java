package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/goal-parser-interpretation
public class GoalParserInterpretation {

    private final String input;

    public GoalParserInterpretation(String input) {
        this.input = input;
    }

    public String solution() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != '(' || i == input.length() - 1) {
                result.append(c);
            } else {
                char next = input.charAt(i + 1);
                if (next == ')') {
                    result.append('o');
                    i++;
                } else {
                    result.append("al");
                    i += 3;
                }
            }
        }
        return result.toString();
    }

}
