package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.*;

// https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum
public class FindSubsequenceOfLengthKWithTheLargestSum {

    private final int[] nums;
    private final int k;

    public FindSubsequenceOfLengthKWithTheLargestSum(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
    }

    public int[] solution() {
        if (nums.length == k) {
            return nums;
        }
        Queue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        for (int i = 0; i < nums.length; i++) {
            queue.add(new int[] {i, nums[i]});
            if (queue.size() > k) {
                queue.remove();
            }
        }
        List<int[]> toSort = new ArrayList<>(queue);
        toSort.sort((a, b) -> a[0] - b[0]);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = toSort.get(i)[1];
        }
        return result;
    }
}
