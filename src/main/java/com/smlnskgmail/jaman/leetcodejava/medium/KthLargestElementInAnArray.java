package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

// https://leetcode.com/problems/kth-largest-element-in-an-array
public class KthLargestElementInAnArray {

    private final int[] nums;
    private final int k;

    public KthLargestElementInAnArray(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
    }

    public int solution() {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a));
        for (int num : nums) {
            queue.add(num);
            if (queue.size() > k) {
                queue.remove();
            }
        }
        return queue.peek();
    }
}
