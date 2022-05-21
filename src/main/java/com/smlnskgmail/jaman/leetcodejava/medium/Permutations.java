package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/permutations/
public class Permutations {

    private final int[] input;

    public Permutations(int[] input) {
        this.input = input;
    }

    public List<List<Integer>> solution() {
        List<List<Integer>> result = new ArrayList<>();
        permutations(input, new ArrayList<>(), result, new boolean[input.length]);
        return result;
    }

    private void permutations(
            int[] nums,
            List<Integer> dS,
            List<List<Integer>> result,
            boolean[] freq
    ) {
        if (dS.size() == nums.length) {
            result.add(new ArrayList<>(dS));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (!freq[i]) {
                    freq[i] = true;
                    dS.add(nums[i]);
                    permutations(nums, dS, result, freq);
                    dS.remove(dS.size() - 1);
                    freq[i] = false;
                }
            }
        }
    }

}
