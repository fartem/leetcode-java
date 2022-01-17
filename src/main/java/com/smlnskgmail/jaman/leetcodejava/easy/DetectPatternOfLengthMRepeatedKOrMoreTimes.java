package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/detect-pattern-of-length-m-repeated-k-or-more-times
public class DetectPatternOfLengthMRepeatedKOrMoreTimes {

    private final int[] arr;
    private final int m;
    private final int k;

    public DetectPatternOfLengthMRepeatedKOrMoreTimes(int[] arr, int m, int k) {
        this.arr = arr;
        this.m = m;
        this.k = k;
    }

    public boolean solution() {
        if (arr.length / m < k) {
            return false;
        }
        for (int i = 0; i < arr.length - m; i++) {
            int[] pattern = new int[m];
            for (int j = i, l = 0; l < m; j++, l++) {
                pattern[l] = arr[j];
            }
            int count = 1;
            for (int j = i + m; j <= arr.length - m; j += m) {
                int length = 0;
                for (int l = j, p = 0; p < m; l++, p++) {
                    if (pattern[p] != arr[l]) {
                        break;
                    }
                    length++;
                }
                if (length >= m && length % m == 0) {
                    count += length / m;
                } else {
                    break;
                }
            }
            if (count == k) {
                return true;
            }
        }
        return false;
    }
}
