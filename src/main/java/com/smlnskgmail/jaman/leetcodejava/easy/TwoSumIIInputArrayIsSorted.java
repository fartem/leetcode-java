package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
public class TwoSumIIInputArrayIsSorted {

    private final int[] numbers;
    private final int target;

    public TwoSumIIInputArrayIsSorted(
            int[] numbers,
            int target
    ) {
        this.numbers = numbers;
        this.target = target;
    }

    public int[] solution() {
        int start = 0;
        int end = numbers.length - 1;
        while (start != end) {
            int sum = numbers[start] + numbers[end];
            if (sum > target) {
                end--;
            } else if (sum < target) {
                start++;
            } else {
                break;
            }
        }
        return new int[]{start + 1, end + 1};
    }

}
