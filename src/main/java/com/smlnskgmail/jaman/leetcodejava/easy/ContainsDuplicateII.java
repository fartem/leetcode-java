package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/contains-duplicate-ii
public class ContainsDuplicateII {

    private final int[] nums;
    private final int k;

    public ContainsDuplicateII(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
    }

    public boolean solution() {
        Map<Integer, List<Integer>> numsWithIndices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (numsWithIndices.containsKey(num)) {
                List<Integer> indices = numsWithIndices.get(num);
                indices.add(i);
                for (int j = 0; j < indices.size() - 1; j++) {
                    if (Math.abs(indices.get(j) - indices.get(j + 1)) <= k) {
                        return true;
                    }
                }
                numsWithIndices.put(num, indices);
            } else {
                List<Integer> indices = new ArrayList<>();
                indices.add(i);
                numsWithIndices.put(num, indices);
            }
        }
        return false;
    }
}
