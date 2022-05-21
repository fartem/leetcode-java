package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/number-of-different-integers-in-a-string/
public class NumberOfDifferentIntegersInAString {

    private final String input;

    public NumberOfDifferentIntegersInAString(String input) {
        this.input = input;
    }

    public int solution() {
        Set<String> uniq = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                boolean leadingZero = c == '0';
                StringBuilder num = new StringBuilder();
                while (Character.isDigit(c)) {
                    if (!leadingZero) {
                        num.append(c);
                    } else if (c != '0') {
                        leadingZero = false;
                        num.append(c);
                    }
                    i++;
                    if (i == input.length()) {
                        break;
                    }
                    c = input.charAt(i);
                }
                uniq.add(num.toString());
            }
        }
        return uniq.size();
    }

}
