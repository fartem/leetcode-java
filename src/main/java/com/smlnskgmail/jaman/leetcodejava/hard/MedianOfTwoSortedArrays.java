package com.smlnskgmail.jaman.leetcodejava.hard;

// https://leetcode.com/problems/median-of-two-sorted-arrays
public class MedianOfTwoSortedArrays {

    private final int[] nums1;
    private final int[] nums2;

    public MedianOfTwoSortedArrays(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
    }

    public double solution() {
        if (nums1.length < nums2.length) {
            return median(nums1, nums2);
        }
        return median(nums2, nums1);
    }

    private double median(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int start = 0;
        int end = n1;
        while (start <= end) {
            int i1 = start + (end - start) / 2;
            int i2 = (n1 + n2 + 1) / 2 - i1;

            int l1 = i1 == n1 ? Integer.MAX_VALUE : a[i1];
            int h1 = i1 == 0 ? Integer.MIN_VALUE : a[i1 - 1];
            int l2 = i2 == n2 ? Integer.MAX_VALUE : b[i2];
            int h2 = i2 == 0 ? Integer.MIN_VALUE : b[i2 - 1];

            if (h1 <= l2 && h2 <= l1) {
                if ((n1 + n2) % 2 == 0) {
                    return (double) (Math.max(h1, h2) + Math.min(l1, l2)) / 2;
                } else {
                    return Math.max(h1, h2);
                }
            } else if (h1 > l2) {
                end = i1 - 1;
            } else {
                start = i1 + 1;
            }
        }
        return -1;
    }

}
