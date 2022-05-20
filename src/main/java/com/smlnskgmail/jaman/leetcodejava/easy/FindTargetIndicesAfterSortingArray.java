package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-target-indices-after-sorting-array/
public class FindTargetIndicesAfterSortingArray {

    private final int[] nums;
    private final int target;

    public FindTargetIndicesAfterSortingArray(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
    }

    public List<Integer> solution() {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result.add(i);
            }
        }
        return result;
    }

}
