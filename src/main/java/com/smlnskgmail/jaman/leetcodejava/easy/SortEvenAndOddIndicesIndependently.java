package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/sort-even-and-odd-indices-independently
public class SortEvenAndOddIndicesIndependently {

    private final int[] nums;

    public SortEvenAndOddIndicesIndependently(int[] input) {
        this.nums = input;
    }

    public int[] solution() {
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0) {
                odds.add(nums[i]);
            } else {
                evens.add(nums[i]);
            }
        }
        odds.sort((o1, o2) -> -Integer.compare(o1, o2));
        evens.sort(Integer::compare);
        int oP = 0;
        int eP = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0) {
                nums[i] = odds.get(oP++);
            } else {
                nums[i] = evens.get(eP++);
            }
        }
        return nums;
    }

}
