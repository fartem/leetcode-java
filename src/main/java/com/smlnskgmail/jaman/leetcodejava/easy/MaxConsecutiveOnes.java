package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/max-consecutive-ones/
public class MaxConsecutiveOnes {

    private final int[] input;

    public MaxConsecutiveOnes(int[] input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        int counter = 0;
        for (int num : input) {
            if (num == 0) {
                result = Math.max(result, counter);
                counter = 0;
            } else {
                counter++;
            }
        }
        return Math.max(result, counter);
    }

}
