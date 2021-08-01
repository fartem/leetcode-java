package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/maximum-number-of-balloons
public class MaximumNumberOfBalloons {

    private final String input;

    public MaximumNumberOfBalloons(String input) {
        this.input = input;
    }

    public int solution() {
        int[] count = new int[26];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int index = c - 97;
            count[index] = count[index] + 1;
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < count.length; i++) {
            int c = i + 97;
            int value = Integer.MAX_VALUE;
            if (c == 'a' || c == 'b' || c == 'n') {
                value = count[i];
            } else if (c == 'l' || c == 'o') {
                value = count[i] / 2;
            }
            if (value == 0) {
                return 0;
            }
            if (value < result) {
                result = value;
            }
        }
        return result;
    }

}
