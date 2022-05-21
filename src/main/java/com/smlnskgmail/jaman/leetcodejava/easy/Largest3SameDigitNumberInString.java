package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/largest-3-same-digit-number-in-string/
public class Largest3SameDigitNumberInString {

    private final String input;

    public Largest3SameDigitNumberInString(String input) {
        this.input = input;
    }

    public String solution() {
        String result = "";
        char prev = input.charAt(0);
        char[] candidate = new char[3];
        int p = 0;
        candidate[p++] = prev;
        for (int i = 1; i < input.length(); i++) {
            char curr = input.charAt(i);
            if (prev != curr) {
                p = 0;
            }
            candidate[p++] = curr;
            if (p == 3) {
                String c = new String(candidate);
                result = result.compareTo(c) > 0 ? result : c;
                p = 0;
            }
            prev = curr;
        }
        return result;
    }

}
