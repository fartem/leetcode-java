package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.PriorityQueue;
import java.util.Queue;

// https://leetcode.com/problems/maximum-product-after-k-increments
public class MaximumProductAfterKIncrements {

    private final int[] nums;
    private int k;

    public MaximumProductAfterKIncrements(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
    }

    public int solution() {
        Queue<Integer> values = new PriorityQueue<>();
        for (int num : nums) {
            values.add(num);
        }
        while (k-- > 0) {
            values.add(values.poll() + 1);
        }
        long result = 1;
        while (!values.isEmpty()) {
            result = (result * values.poll()) % 1000000007;
        }
        return (int) result;
    }

}
