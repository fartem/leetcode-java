package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/count-hills-and-valleys-in-an-array
public class CountHillsAndValleysInAnArray {

    private final int[] nums;

    public CountHillsAndValleysInAnArray(int[] input) {
        this.nums = input;
    }

    public int solution() {
        int result = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            int num = nums[i];
            if (num == nums[i - 1]) {
                continue;
            }
            int pLeft = i - 1;
            while (pLeft > 0 && nums[pLeft] == num) {
                pLeft--;
            }
            if (num != nums[pLeft]) {
                int pRight = i + 1;
                while (pRight < nums.length - 1 && nums[pRight] == num) {
                    pRight++;
                }
                int left = nums[pLeft];
                int right = nums[pRight];
                result += ((num < left && num < right) || (num > left && num > right)) ? 1 : 0;
            }
        }
        return result;
    }

}
