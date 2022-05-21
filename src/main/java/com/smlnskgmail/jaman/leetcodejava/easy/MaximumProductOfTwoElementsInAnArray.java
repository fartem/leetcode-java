package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
public class MaximumProductOfTwoElementsInAnArray {

    private final int[] input;

    public MaximumProductOfTwoElementsInAnArray(int[] input) {
        this.input = input;
    }

    public int solution() {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : input) {
            if (num > firstMax) {
                int temp = firstMax;
                firstMax = num;
                secondMax = temp;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }
        return (firstMax - 1) * (secondMax - 1);
    }

}
