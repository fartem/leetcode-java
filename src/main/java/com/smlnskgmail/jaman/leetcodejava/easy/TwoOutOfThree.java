package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/two-out-of-three/
public class TwoOutOfThree {

    private final int[] nums1;
    private final int[] nums2;
    private final int[] nums3;

    public TwoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.nums3 = nums3;
    }

    public List<Integer> solution() {
        int[] f = new int[101];
        for (int num : nums1) {
            f[num]++;
        }
        int[] s = new int[101];
        for (int num : nums2) {
            s[num]++;
        }
        int[] t = new int[101];
        for (int num : nums3) {
            t[num]++;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if ((f[i] > 0 && s[i] > 0)
                    || (s[i] > 0 && t[i] > 0)
                    || (f[i] > 0 && t[i] > 0)) {
                result.add(i);
            }
        }
        return result;
    }

}
