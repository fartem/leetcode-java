package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/keep-multiplying-found-values-by-two
public class KeepMultiplyingFoundValuesByTwo {

    private final int[] nums;
    private int original;

    public KeepMultiplyingFoundValuesByTwo(int[] nums, int original) {
        this.nums = nums;
        this.original = original;
    }

    public int solution() {
        Set<Integer> uniq = new HashSet<>();
        for (int num : nums) {
            uniq.add(num);
        }
        while (uniq.contains(original)) {
            original *= 2;
        }
        return original;
    }

}
