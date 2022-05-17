package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/find-the-difference-of-two-arrays
public class FindTheDifferenceOfTwoArrays {

    private final int[] nums1;
    private final int[] nums2;

    public FindTheDifferenceOfTwoArrays(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
    }

    public List<List<Integer>> solution() {
        Set<Integer> values1 = new HashSet<>();
        for (int num : nums1) {
            values1.add(num);
        }
        Set<Integer> values2 = new HashSet<>();
        for (int num : nums2) {
            values2.add(num);
        }
        List<Integer> first = new ArrayList<>();
        for (int value : values1) {
            if (!values2.contains(value)) {
                first.add(value);
            }
        }
        List<Integer> second = new ArrayList<>();
        for (int value : values2) {
            if (!values1.contains(value)) {
                second.add(value);
            }
        }
        return List.of(first, second);
    }

}
