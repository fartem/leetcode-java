package com.smlnskgmail.jaman.leetcodejava.hard;

import java.util.Deque;
import java.util.LinkedList;

// https://leetcode.com/problems/sliding-window-maximum/
public class SlidingWindowMaximum {

    private final int[] nums;
    private final int k;

    public SlidingWindowMaximum(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
    }

    public int[] solution() {
        int[] result = new int[nums.length - k + 1];
        int p = 0;
        int i = 0;
        int j = 0;
        Deque<Integer> deq = new LinkedList<>();
        while (j < nums.length) {
            while (!deq.isEmpty() && nums[j] > deq.peekLast()) {
                deq.removeLast();
            }
            deq.addLast(nums[j]);
            int size = j - i + 1;
            if (size < k) {
                j++;
            } else {
                result[p++] = deq.peekFirst();
                if (deq.peekFirst() == nums[i]) {
                    deq.removeFirst();
                }
                i++;
                j++;
            }
        }
        return result;
    }

}
