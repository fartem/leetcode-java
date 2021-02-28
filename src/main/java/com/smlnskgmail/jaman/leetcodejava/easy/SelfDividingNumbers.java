package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/self-dividing-numbers
public class SelfDividingNumbers {

    private final int left;
    private final int right;

    public SelfDividingNumbers(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public List<Integer> solution() {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int num = i;
            boolean isSelfDividing = true;
            while (num != 0) {
                int candidate = num % 10;
                if (candidate == 0) {
                    isSelfDividing = false;
                    break;
                }
                int rem = i % candidate;
                if (rem != 0) {
                    isSelfDividing = false;
                    break;
                }
                num /= 10;
            }
            if (isSelfDividing) {
                result.add(i);
            }
        }
        return result;
    }

}
