package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array
public class FindAllNumbersDisappearedInAnArray {

    private final int[] input;

    public FindAllNumbersDisappearedInAnArray(int[] input) {
        this.input = input;
    }

    public List<Integer> solution() {
        Set<Integer> unique = new HashSet<>();
        for (int i : input) {
            unique.add(i);
        }
        int num = 0;
        int size = input.length - unique.size();
        List<Integer> missed = new ArrayList<>();
        while (missed.size() != size) {
            num += 1;
            if (!unique.contains(num)) {
                missed.add(num);
            }
        }
        return missed;
    }
}
