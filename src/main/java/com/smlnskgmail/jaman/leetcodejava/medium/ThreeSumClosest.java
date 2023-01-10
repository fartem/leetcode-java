package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Arrays;

// https://leetcode.com/problems/3sum-closest/
public class ThreeSumClosest {

    private final int[] nums;
    private final int target;

    public ThreeSumClosest(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
    }

    public int solution() {
        if (nums.length == 3) {
            return nums[0] + nums[1] + nums[2];
        }
        Arrays.sort(nums);
        int n = nums.length;
        int max = nums[n - 1] + nums[n - 2] + nums[n - 3];
        if (target > max) {
            return max;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                int curr = nums[i];
                max = curr + nums[r - 1] + nums[r];
                if (target - max > Math.abs(min)) {
                    break;
                }
                int minSum = curr + nums[l] + nums[l + 1];
                if (minSum - target > Math.abs(min)) {
                    break;
                }
                int sum = curr + nums[l] + nums[r];
                if (sum == target) {
                    return sum;
                }
                int diff = sum - target;
                if (Math.abs(diff) < Math.abs(min)) {
                    min = diff;
                }
                if (diff > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return target + min;
    }

}
