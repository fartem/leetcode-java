package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/next-greater-element-i
public class NextGreaterElementI {

    private final int[] nums1;
    private final int[] nums2;

    public NextGreaterElementI(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
    }

    public int[] solution() {
        Map<Integer, Integer> numbsWithIndices = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            numbsWithIndices.put(nums2[i], i);
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            for (int j = numbsWithIndices.get(num); j < nums2.length; j++) {
                int candidate = nums2[j];
                if (num < candidate) {
                    result[i] = candidate;
                    break;
                }
            }
            if (result[i] == 0) {
                result[i] = -1;
            }
        }
        return result;
    }

}
