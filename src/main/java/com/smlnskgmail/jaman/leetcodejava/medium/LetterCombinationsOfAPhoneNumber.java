package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number
public class LetterCombinationsOfAPhoneNumber {

    private final String digits;

    public LetterCombinationsOfAPhoneNumber(String input) {
        this.digits = input;
    }

    public List<String> solution() {
        if (digits.isEmpty()) {
            return Collections.emptyList();
        }
        String[] buttons = new String[]{
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "prsq",
                "tuv",
                "wxyz"
        };
        List<String> result = new ArrayList<>();
        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            char c = digits.charAt(i);
            List<String> newResult = new ArrayList<>();
            String curr = buttons[c - '2'];
            for (String layout : result) {
                for (int j = 0; j < curr.length(); j++) {
                    newResult.add(layout + curr.charAt(j));
                }
            }
            result = newResult;
        }
        return result;
    }

}
