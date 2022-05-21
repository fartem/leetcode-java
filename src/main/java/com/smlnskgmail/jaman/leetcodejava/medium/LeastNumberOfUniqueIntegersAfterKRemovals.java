package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/
public class LeastNumberOfUniqueIntegersAfterKRemovals {

    private final int[] arr;
    private int k;

    public LeastNumberOfUniqueIntegersAfterKRemovals(int[] arr, int k) {
        this.arr = arr;
        this.k = k;
    }

    public int solution() {
        Map<Integer, Integer> numsWithCount = new HashMap<>();
        for (int num : arr) {
            numsWithCount.put(num, numsWithCount.getOrDefault(num, 0) + 1);
        }
        int[] toSort = new int[numsWithCount.size()];
        int p = 0;
        for (Map.Entry<Integer, Integer> numWithCount : numsWithCount.entrySet()) {
            toSort[p++] = numWithCount.getValue();
        }
        Arrays.sort(toSort);
        int count = 0;
        p = 0;
        while (k > 0) {
            int c = toSort[p++];
            if (k >= c) {
                count++;
            }
            k -= c;
        }
        return numsWithCount.size() - count;
    }

}
