package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/3sum/
public class ThreeSum {

    private final int[] input;

    public ThreeSum(int[] input) {
        this.input = input;
    }

    public List<List<Integer>> solution() {
        Arrays.sort(input);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < input.length - 2; i++) {
            int curr = input[i];
            if (i > 0 && curr == input[i - 1]) {
                continue;
            }
            int rem = -curr;
            int start = i + 1;
            int end = input.length - 1;
            while (start < end) {
                int s = input[start];
                int e = input[end];
                if (s + e == rem) {
                    List<Integer> part = new ArrayList<>();
                    part.add(curr);
                    part.add(s);
                    part.add(e);
                    result.add(part);
                    while (start < end && input[start] == input[start + 1]) {
                        start++;
                    }
                    while (start < end && input[end] == input[end - 1]) {
                        end--;
                    }
                    start++;
                    end--;
                } else if (s + e > rem) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return result;
    }

}
