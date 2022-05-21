package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/two-sum/
public class TwoSum {

    private final int[] array;
    private final int target;

    public TwoSum(int[] array, int target) {
        this.array = array;
        this.target = target;
    }

    public int[] solution() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution!");
    }

}
