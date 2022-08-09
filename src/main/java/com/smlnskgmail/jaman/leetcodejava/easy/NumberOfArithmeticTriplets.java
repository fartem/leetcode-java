package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/number-of-arithmetic-triplets/
public class NumberOfArithmeticTriplets {

    private final int[] nums;
    private final int diff;

    public NumberOfArithmeticTriplets(int[] nums, int diff) {
        this.nums = nums;
        this.diff = diff;
    }

    public int solution() {
        Set<Integer> uniq = new HashSet<>();
        for (int num : nums) {
            uniq.add(num);
        }
        int result = 0;
        for (int num : uniq) {
            if (uniq.contains(num + diff) && uniq.contains(num + 2 * diff)) {
                result++;
            }
        }
        return result;
    }

}
