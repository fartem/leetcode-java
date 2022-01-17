package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/largest-number-at-least-twice-of-others
public class LargestNumberAtLeastTwiceOfOthers {

    private final int[] input;

    public LargestNumberAtLeastTwiceOfOthers(int[] input) {
        this.input = input;
    }

    public int solution() {
        int max = 0;
        int index = 0;
        for (int i = 0; i < input.length; i++) {
            int num = input[i];
            if (num > max) {
                max = num;
                index = i;
            }
        }
        for (int num : input) {
            if (max != num && max < num * 2) {
                return -1;
            }
        }
        return index;
    }
}
