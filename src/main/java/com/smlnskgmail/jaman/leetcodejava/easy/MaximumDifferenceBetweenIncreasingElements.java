package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/maximum-difference-between-increasing-elements
public class MaximumDifferenceBetweenIncreasingElements {

    private final int[] input;

    public MaximumDifferenceBetweenIncreasingElements(int[] input) {
        this.input = input;
    }

    public int solution() {
        int min = input[0];
        int diff = input[1] - min;
        for (int num : input) {
            if (num - min > diff) {
                diff = num - min;
            } else if (min > num) {
                min = num;
            }
        }
        return diff == 0 ? -1 : diff;
    }
}
