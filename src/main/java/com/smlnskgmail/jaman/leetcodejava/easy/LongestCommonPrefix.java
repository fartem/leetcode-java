package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/longest-common-prefix
public class LongestCommonPrefix {

    private final String[] input;

    public LongestCommonPrefix(String[] input) {
        this.input = input;
    }

    public String solution() {
        if (input.length == 1) {
            return input[0];
        }
        StringBuilder result = new StringBuilder();
        String first = input[0];
        String second = input[1];
        for (int i = 0; i < first.length() && i < second.length(); i++) {
            if (first.charAt(i) == second.charAt(i)) {
                result.append(first.charAt(i));
            } else {
                break;
            }
        }
        if (result.length() == 0) {
            return "";
        }
        for (int i = 2; i < input.length; i++) {
            String str = input[i];
            while (!str.startsWith(result.toString())) {
                result.setLength(result.length() - 1);
            }
        }
        return result.toString();
    }
}
