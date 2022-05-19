package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/calculate-digit-sum-of-a-string
public class CalculateDigitSumOfAString {

    private String s;
    private final int k;

    public CalculateDigitSumOfAString(String s, int k) {
        this.s = s;
        this.k = k;
    }

    public String solution() {
        while (s.length() > k) {
            List<String> groups = new ArrayList<>();
            for (int i = 0; i < s.length(); i += k) {
                groups.add(s.substring(i, i + Math.min(k, s.length() - i)));
            }
            StringBuilder newS = new StringBuilder();
            for (String group : groups) {
                int num = 0;
                for (int i = 0; i < group.length(); i++) {
                    num += group.charAt(i) - '0';
                }
                newS.append(num);
            }
            s = newS.toString();
        }
        return s;
    }

}
