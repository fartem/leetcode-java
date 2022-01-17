package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold
public class NumberOfSubarraysOfSizeKAndAverageGreaterThanOrEqualToThreshold {

    private final int[] arr;
    private final int k;
    private final int threshold;

    public NumberOfSubarraysOfSizeKAndAverageGreaterThanOrEqualToThreshold(
            int[] arr, int k, int threshold) {
        this.arr = arr;
        this.k = k;
        this.threshold = threshold;
    }

    public int solution() {
        int result = 0;
        int left = 0;
        int sum = 0;
        int border = k - 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i >= border) {
                if (i != border) {
                    sum -= arr[left++];
                }
                if ((sum / k) >= threshold) {
                    result++;
                }
            }
        }
        return result;
    }
}
