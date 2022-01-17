package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits
public class FindNumbersWithEvenNumberOfDigits {

    private final int[] input;

    public FindNumbersWithEvenNumberOfDigits(int[] input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        for (int num : input) {
            if (((int) Math.log10(num) + 1) % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}
