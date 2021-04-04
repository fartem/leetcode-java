package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/kth-missing-positive-number
public class KthMissingPositiveNumber {

    private final int[] array;
    private final int k;

    public KthMissingPositiveNumber(int[] array, int k) {
        this.array = array;
        this.k = k;
    }

    public int solution() {
        Set<Integer> nums = new HashSet<>(array.length);
        for (int num : array) {
            nums.add(num);
        }
        int skipped = 0;
        int max = Math.max(array[array.length - 1], array.length + k + 1);
        for (int i = 0; i < max; i++) {
            if (!nums.contains(i)) {
                if (skipped == k) {
                    return i;
                }
                skipped++;
            }
        }
        return 0;
    }

}
