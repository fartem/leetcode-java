package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/vowels-of-all-substrings/
public class VowelsOfAllSubstrings {

    private final String input;

    public VowelsOfAllSubstrings(String input) {
        this.input = input;
    }

    public long solution() {
        long result = 0;
        int length = input.length();
        for (int i = 0; i < length; i++) {
            if (isVowel(input.charAt(i))) {
                result += (long) (length - i) * (long) (i + 1);
            }
        }
        return result;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
