package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/generate-parentheses/
public class GenerateParentheses {

    private final int input;

    public GenerateParentheses(int input) {
        this.input = input;
    }

    public List<String> solution() {
        return generate(input);
    }

    private List<String> generate(int n) {
        List<String> result = new ArrayList<>();
        if (n == 0) {
            result.add("");
        }
        for (int i = 0; i < n; i++) {
            for (String left : generate(i)) {
                for (String right : generate(n - 1 - i)) {
                    result.add("(" + left + ")" + right);
                }
            }
        }
        return result;
    }

}
