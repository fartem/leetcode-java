package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/continuous-subarray-sum/
public class ContinuousSubarraySum {

    private final int[] nums;
    private final int k;

    public ContinuousSubarraySum(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
    }

    public boolean solution() {
        int rem;
        int sum = 0;
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            rem = (sum + num) % k;
            if (seen.contains(rem)) {
                return true;
            }
            seen.add(sum);
            sum = rem;
        }
        return false;
    }

}
