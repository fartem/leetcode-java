package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {

    private final int[] nums;
    private final int[] queries;

    public LongestSubsequenceWithLimitedSum(int[] nums, int[] queries) {
        this.nums = nums;
        this.queries = queries;
    }

    public int[] solution() {
        int[] result = new int[queries.length];
        Arrays.sort(nums);
        for (int i = 0; i < queries.length; i++) {
            int sum = 0;
            int j;
            for (j = 0; j < nums.length; j++) {
                int num = nums[j];
                if (sum + num > queries[i]) {
                    result[i] = j;
                    break;
                }
                sum += num;
            }
            if (j == nums.length) {
                result[i] = j;
            }
        }
        return result;
    }

}
