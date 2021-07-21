package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/reformat-phone-number
public class ReformatPhoneNumber {

    private final String input;

    public ReformatPhoneNumber(String input) {
        this.input = input;
    }

    public String solution() {
        if (input.length() < 4) {
            return input;
        }
        List<Character> digits = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != '-' && c != ' ') {
                digits.add(c);
            }
        }
        StringBuilder result = new StringBuilder();
        int diff = digits.size() % 3 == 0 ? 2 : (digits.size() - 2) % 3 == 0 ? 2 : 4;
        for (int i = 0; i < digits.size() - diff; i += 3) {
            if (i != 0) {
                result.append('-');
            }
            for (int j = i; j < i + 3; j++) {
                result.append(digits.get(j));
            }
        }
        if (digits.size() % 3 != 0) {
            for (int i = 0; i < diff; i++) {
                if (result.length() != 0 && i % 2 == 0) {
                    result.append('-');
                }
                result.append(digits.get(digits.size() - diff + i));
            }
        }
        return result.toString();
    }

}
