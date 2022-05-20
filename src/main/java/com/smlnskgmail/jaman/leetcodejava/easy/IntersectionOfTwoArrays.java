package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/intersection-of-two-arrays/
public class IntersectionOfTwoArrays {

    private final int[] nums1;
    private final int[] nums2;

    public IntersectionOfTwoArrays(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
    }

    public int[] solution() {
        int[] nums = new int[1000];
        for (int num : nums1) {
            nums[num] = 1;
        }
        int count = 0;
        for (int num : nums2) {
            if (nums[num] == 1) {
                nums[num] = -1;
                count++;
            }
        }
        int[] result = new int[count];
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == -1) {
                result[pos++] = i;
            }
        }
        return result;
    }

}
