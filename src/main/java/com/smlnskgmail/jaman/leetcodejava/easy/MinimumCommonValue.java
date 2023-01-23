package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/minimum-common-value/
public class MinimumCommonValue {

    private final int[] nums1;
    private final int[] nums2;

    public MinimumCommonValue(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
    }

    public int solution() {
        int lastMin = 0;
        for (int num : nums1) {
            for (int i = lastMin; i < nums2.length; i++) {
                int curr = nums2[i];
                if (curr == num) {
                    return num;
                }
                if (curr > num) {
                    lastMin = i;
                    break;
                }
            }
        }
        return -1;
    }

}
