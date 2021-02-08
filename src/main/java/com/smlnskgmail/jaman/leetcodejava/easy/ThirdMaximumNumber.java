package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/third-maximum-number
public class ThirdMaximumNumber {

    private final int[] input;

    public ThirdMaximumNumber(int[] input) {
        this.input = input;
    }

    public int solution() {
        Arrays.sort(input);
        int length = input.length;
        int lastNum = input[length - 1];
        if (length < 3) {
            return lastNum;
        }
        int target = lastNum;
        int counter = 2;
        for (int i = length - 2; i >= 0; i--) {
            int num = input[i];
            if (target != num) {
                counter--;
                target = num;
            }
            if (counter == 0) {
                break;
            }
        }
        if (counter != 0) {
            return lastNum;
        }
        return target;
    }

}
