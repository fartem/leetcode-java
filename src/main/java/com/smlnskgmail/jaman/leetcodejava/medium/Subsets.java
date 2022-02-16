package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/subsets
public class Subsets {

    private final int[] nums;

    public Subsets(int[] input) {
        this.nums = input;
    }

    public List<List<Integer>> solution() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.emptyList());
        for (int num : nums) {
            List<List<Integer>> subsets = new ArrayList<>();
            for (List<Integer> subset : result) {
                subsets.add(new ArrayList<>(subset) {{
                    add(num);
                }});
            }
            result.addAll(subsets);
        }
        return result;
    }

}
