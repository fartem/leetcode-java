package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/string-matching-in-an-array/
public class StringMatchingInAnArray {

    private final List<String> input;

    public StringMatchingInAnArray(List<String> input) {
        this.input = input;
    }

    public List<String> solution() {
        Set<String> matches = new HashSet<>();
        for (String word : input) {
            if (!matches.contains(word)) {
                for (String candidate : input) {
                    if (!word.equals(candidate) && word.contains(candidate)) {
                        matches.add(candidate);
                    }
                }
            }
        }
        return new ArrayList<>(matches);
    }

}
