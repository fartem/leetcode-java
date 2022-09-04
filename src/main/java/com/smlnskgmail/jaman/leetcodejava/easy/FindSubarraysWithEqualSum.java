package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/find-subarrays-with-equal-sum/
public class FindSubarraysWithEqualSum {

    private final int[] input;

    public FindSubarraysWithEqualSum(int[] input) {
        this.input = input;
    }

    public boolean solution() {
        Set<Integer> sums = new HashSet<>();
        int c = input[0];
        for (int i = 1; i < input.length; i++) {
            int curr = input[i];
            int sum = c + curr;
            if (sums.contains(sum)) {
                return true;
            }
            sums.add(sum);
            c = curr;
        }
        return false;
    }

}
