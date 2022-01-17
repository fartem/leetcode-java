package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/number-of-segments-in-a-string
public class NumberOfSegmentsInAString {

    private final String input;

    public NumberOfSegmentsInAString(String input) {
        this.input = input;
    }

    public int solution() {
        String string = input.trim();
        return string.length() == 0 ? 0 : string.split("\\s+").length;
    }
}
