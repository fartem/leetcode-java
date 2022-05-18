package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/find-closest-number-to-zero
public class FindClosestNumberToZero {

    private final int[] input;

    public FindClosestNumberToZero(int[] input) {
        this.input = input;
    }

    public int solution() {
        int min = Integer.MAX_VALUE;
        int result = 0;
        for (int num : input) {
            if (min > Math.abs(num)) {
                min = Math.abs(num);
                result = num;
            } else if (min == Math.abs(num) && result < num) {
                result = num;
            }
        }
        return result;
    }

}
