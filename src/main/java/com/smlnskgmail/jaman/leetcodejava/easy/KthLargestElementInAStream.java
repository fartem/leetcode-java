package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

// https://leetcode.com/problems/kth-largest-element-in-a-stream/
public class KthLargestElementInAStream {

    private final Queue<Integer> heap = new PriorityQueue<>();
    private final int k;

    public KthLargestElementInAStream(int k, int[] nums) {
        this.k = k;
        Arrays.sort(nums);
        if (nums.length > k) {
            for (int i = nums.length - k; i < nums.length; i++) {
                heap.add(nums[i]);
            }
        } else {
            for (int num : nums) {
                heap.add(num);
            }
        }
    }

    public int add(int val) {
        heap.add(val);
        if (heap.size() > k) {
            heap.poll();
        }
        return heap.peek();
    }

}
