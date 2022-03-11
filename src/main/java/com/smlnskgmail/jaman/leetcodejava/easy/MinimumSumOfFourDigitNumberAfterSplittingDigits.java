package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

public class MinimumSumOfFourDigitNumberAfterSplittingDigits {

    private int input;

    public MinimumSumOfFourDigitNumberAfterSplittingDigits(int input) {
        this.input = input;
    }

    public int solution() {
        int[] nums = new int[4];
        int p = 0;
        while (input != 0) {
            nums[p++] = input % 10;
            input /= 10;
        }
        Arrays.sort(nums);
        return (nums[0] * 10 + nums[3]) + (nums[1] * 10 + nums[2]);
    }

}
