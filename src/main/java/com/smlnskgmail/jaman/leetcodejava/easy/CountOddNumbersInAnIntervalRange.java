package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range
public class CountOddNumbersInAnIntervalRange {

    private final int low;
    private final int high;

    public CountOddNumbersInAnIntervalRange(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public int solution() {
        int additional = low % 2 == 0 && high % 2 == 0 ? 0 : 1;
        return (high - low) / 2 + additional;
    }

}
