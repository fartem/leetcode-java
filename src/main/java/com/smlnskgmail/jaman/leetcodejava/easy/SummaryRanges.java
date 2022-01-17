package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/summary-ranges
public class SummaryRanges {

    private final int[] input;

    public SummaryRanges(int[] input) {
        this.input = input;
    }

    public List<String> solution() {
        if (input.length == 0) {
            return Collections.emptyList();
        }
        List<String> result = new ArrayList<>();
        int start = input[0];
        int end = start;
        for (int i = 1; i < input.length; i++) {
            int num = input[i];
            if (end + 1 == num) {
                end = num;
            } else {
                if (start == end) {
                    result.add(String.valueOf(start));
                } else {
                    StringBuilder range = new StringBuilder();
                    range.append(start).append("->").append(end);
                    result.add(range.toString());
                }
                start = num;
                end = start;
            }
        }
        if (start == end) {
            result.add(String.valueOf(start));
        } else {
            StringBuilder range = new StringBuilder();
            range.append(start).append("->").append(end);
            result.add(range.toString());
        }
        return result;
    }
}
