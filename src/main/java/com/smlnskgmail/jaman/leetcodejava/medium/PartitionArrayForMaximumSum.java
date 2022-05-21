package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/partition-array-for-maximum-sum/
public class PartitionArrayForMaximumSum {

    private final int[] arr;
    private final int k;

    public PartitionArrayForMaximumSum(int[] arr, int k) {
        this.arr = arr;
        this.k = k;
    }

    public int solution() {
        int[] partitioned = new int[arr.length + 1];
        for (int i = 1; i <= arr.length; i++) {
            int max = 0;
            int val = 0;
            for (int j = 1; j <= Math.min(i, k); j++) {
                max = Math.max(max, arr[i - j]);
                val = Math.max(partitioned[i - j] + max * j, val);
            }
            partitioned[i] = val;
        }
        return partitioned[arr.length];
    }

}
