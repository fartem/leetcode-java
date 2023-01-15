package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/
public class DifferenceBetweenElementSumAndDigitSumOfAnArray {

    private final int[] input;

    public DifferenceBetweenElementSumAndDigitSumOfAnArray(int[] input) {
        this.input = input;
    }

    public int solution() {
        int sumOfNums = 0;
        int sumOfDigits = 0;
        for (int num : input) {
            sumOfNums += num;
            int n = num;
            while (n != 0) {
                sumOfDigits += n % 10;
                n /= 10;
            }
        }
        return Math.abs(sumOfNums - sumOfDigits);
    }

}
