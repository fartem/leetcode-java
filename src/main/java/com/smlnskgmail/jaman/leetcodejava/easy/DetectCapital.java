package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/detect-capital/
public class DetectCapital {

    private final String input;

    public DetectCapital(String input) {
        this.input = input;
    }

    public boolean solution() {
        if (input.charAt(0) < 97) {
            String sub = input.substring(1);
            return sub.toLowerCase().equals(sub) || input.toUpperCase().equals(input);
        }
        return input.toLowerCase().equals(input);
    }

}
