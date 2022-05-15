package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/find-three-consecutive-integers-that-sum-to-a-given-number
public class FindThreeConsecutiveIntegersThatSumToAGivenNumber {

    private final long num;

    public FindThreeConsecutiveIntegersThatSumToAGivenNumber(long input) {
        this.num = input;
    }

    public long[] solution() {
        long middle = num / 3;
        long start = middle - 1;
        long end = middle + 1;
        if ((start + middle + end) != num) {
            return new long[]{};
        }
        return new long[]{start, middle, end};
    }

}
