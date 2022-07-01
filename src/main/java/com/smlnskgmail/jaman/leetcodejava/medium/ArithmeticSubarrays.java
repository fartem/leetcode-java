package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/arithmetic-subarrays/
public class ArithmeticSubarrays {

    private final int[] nums;
    private final int[] l;
    private final int[] r;

    public ArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        this.nums = nums;
        this.l = l;
        this.r = r;
    }

    public List<Boolean> solution() {
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            result.add(calculate(nums, l[i], r[i]));
        }
        return result;
    }

    private boolean calculate(int[] nums, int l, int r) {
        List<Integer> n = new ArrayList<>();
        for (int i = l; i < r + 1; i++) {
            n.add(nums[i]);
        }
        Collections.sort(n);
        for (int i = 0; i < n.size() - 1; i++) {
            if (n.get(i + 1) - n.get(i) != n.get(1) - n.get(0)) {
                return false;
            }
        }
        return true;
    }

}
