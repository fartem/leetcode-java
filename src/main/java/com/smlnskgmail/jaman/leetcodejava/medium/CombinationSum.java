package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combination-sum/
public class CombinationSum {

    private final List<List<Integer>> result = new ArrayList<>();
    private final List<Integer> curr = new ArrayList<>();

    private final int[] candidates;
    private final int target;

    public CombinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        this.target = target;
    }

    public List<List<Integer>> solution() {
        findCombination(candidates, target, 0);
        return result;
    }

    private void findCombination(int[] candidates, int target, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            curr.add(candidates[i]);
            findCombination(candidates, target - candidates[i], i);
            curr.remove(curr.size() - 1);
        }

    }
}
