package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string
public class RemoveAllAdjacentDuplicatesInString {

    private final String input;

    public RemoveAllAdjacentDuplicatesInString(String input) {
        this.input = input;
    }

    public String solution() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int length = result.length() - 1;
            if (length >= 0 && result.charAt(length) == c) {
                result.deleteCharAt(length);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

}
