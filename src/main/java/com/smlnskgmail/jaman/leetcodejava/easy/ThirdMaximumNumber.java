package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/third-maximum-number/
public class ThirdMaximumNumber {

    private final int[] input;

    public ThirdMaximumNumber(int[] input) {
        this.input = input;
    }

    public int solution() {
        Arrays.sort(input);
        int n = input.length;
        int last = input[n - 1];
        if (n < 3) {
            return last;
        }
        int target = last;
        int counter = 2;
        for (int i = n - 2; i >= 0; i--) {
            int num = input[i];
            if (target != num) {
                counter--;
                target = num;
            }
            if (counter == 0) {
                return target;
            }
        }
        return last;
    }

}
