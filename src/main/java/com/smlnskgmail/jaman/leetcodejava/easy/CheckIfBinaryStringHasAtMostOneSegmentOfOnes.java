package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones
public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {

    private final String input;

    public CheckIfBinaryStringHasAtMostOneSegmentOfOnes(String input) {
        this.input = input;
    }

    public boolean solution() {
        char digit = input.charAt(0);
        if (digit == '0') {
            return false;
        }
        boolean afterSegment = false;
        for (int i = 1; i < input.length(); i++) {
            digit = input.charAt(i);
            if (digit == '0') {
                afterSegment = true;
            } else if (afterSegment) {
                return false;
            }
        }
        return true;
    }
}
