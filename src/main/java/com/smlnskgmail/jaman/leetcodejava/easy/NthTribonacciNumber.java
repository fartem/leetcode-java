package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/n-th-tribonacci-number
public class NthTribonacciNumber {

    private final int input;

    public NthTribonacciNumber(int input) {
        this.input = input;
    }

    public int solution() {
        int[] nums = new int[38];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 1;
        for (int i = 3; i <= input; i++) {
            nums[i] = nums[i - 3] + nums[i - 2] + nums[i - 1];
        }
        return nums[input];
    }

}
