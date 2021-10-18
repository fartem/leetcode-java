package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/merge-sorted-array
public class MergeSortedArray {

    private final int[] nums1;
    private final int m;
    private final int[] nums2;
    private final int n;

    public MergeSortedArray(
            int[] nums1,
            int m,
            int[] nums2,
            int n
    ) {
        this.nums1 = nums1;
        this.m = m;
        this.nums2 = nums2;
        this.n = n;
    }

    public void solution() {
        int i = m - 1;
        int j = n - 1;
        int l = m + n - 1;
        while (l >= 0) {
            if (j < 0 || (i >= 0 && nums1[i] > nums2[j])) {
                nums1[l--] = nums1[i--];
            } else {
                nums1[l--] = nums2[j--];
            }
        }
    }

}
