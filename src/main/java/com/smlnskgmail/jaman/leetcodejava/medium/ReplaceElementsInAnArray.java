package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/replace-elements-in-an-array/
public class ReplaceElementsInAnArray {

    private final int[] nums;
    private final int[][] operations;

    public ReplaceElementsInAnArray(int[] nums, int[][] operations) {
        this.nums = nums;
        this.operations = operations;
    }

    public int[] solution() {
        Map<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indices.put(nums[i], i);
        }
        for (int[] operation : operations) {
            int index = indices.get(operation[0]);
            nums[index] = operation[1];
            indices.remove(operation[0]);
            indices.put(operation[1], index);
        }
        return nums;
    }

}
