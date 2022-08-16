package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/two-sum/
public class TwoSum {

    private final int[] nums;
    private final int target;

    public TwoSum(int[] array, int target) {
        this.nums = array;
        this.target = target;
    }

    public int[] solution() {
        Map<Integer, List<Integer>> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (numbers.containsKey(num)) {
                numbers.get(num).add(i);
            } else {
                List<Integer> indices = new ArrayList<>();
                indices.add(i);
                numbers.put(num, indices);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if (numbers.containsKey(diff)) {
                var indices = numbers.get(diff);
                for (int index : indices) {
                    if (index != i) {
                        return new int[]{i, index};
                    }
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution!");
    }

}
