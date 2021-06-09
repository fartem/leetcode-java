package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/intersection-of-two-arrays-ii
public class IntersectionOfTwoArraysII {

    private final int[] nums1;
    private final int[] nums2;

    public IntersectionOfTwoArraysII(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
    }

    public int[] solution() {
        int[] nums = new int[1000];
        for (int num : nums1) {
            nums[num] = nums[num] + 1;
        }
        List<Integer> intersections = new ArrayList<>();
        for (int num : nums2) {
            if (nums[num] > 0) {
                intersections.add(num);
                nums[num] = nums[num] - 1;
            }
        }
        int[] result = new int[intersections.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = intersections.get(i);
        }
        return result;
    }

}
