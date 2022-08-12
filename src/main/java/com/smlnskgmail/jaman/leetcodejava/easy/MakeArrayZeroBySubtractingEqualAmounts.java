package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/
public class MakeArrayZeroBySubtractingEqualAmounts {

    private final int[] input;

    public MakeArrayZeroBySubtractingEqualAmounts(int[] input) {
        this.input = input;
    }

    public int solution() {
        Set<Integer> result = new HashSet<>();
        for (int num : input) {
            if (num != 0) {
                result.add(num);
            }
        }
        return result.size();
    }

}
