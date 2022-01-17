package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/create-target-array-in-the-given-order
public class CreateTargetArrayInTheGivenOrder {

    private final int[] nums;
    private final int[] index;

    public CreateTargetArrayInTheGivenOrder(int[] nums, int[] index) {
        this.nums = nums;
        this.index = index;
    }

    public int[] solution() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            numbers.add(index[i], nums[i]);
        }
        int[] result = new int[numbers.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = numbers.get(i);
        }
        return result;
    }
}
