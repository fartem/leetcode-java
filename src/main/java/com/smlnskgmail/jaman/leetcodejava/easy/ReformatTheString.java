package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/reformat-the-string
public class ReformatTheString {

    private final String input;

    public ReformatTheString(String input) {
        this.input = input;
    }

    public String solution() {
        List<Character> letters = new ArrayList<>();
        List<Character> digits = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                digits.add(c);
            } else {
                letters.add(c);
            }
        }
        int diff = letters.size() - digits.size();
        if (diff == -1 || diff == 0 || diff == 1) {
            List<Character> max = letters.size() > digits.size() ? letters : digits;
            List<Character> min = max == letters ? digits : letters;
            StringBuilder result = new StringBuilder();
            int maxP = 0;
            int minP = 0;
            while (maxP < max.size() && minP < min.size()) {
                result.append(max.get(maxP++));
                result.append(min.get(minP++));
            }
            if (diff != 0) {
                result.append(max.get(maxP));
            }
            return result.toString();
        }
        return "";
    }
}
