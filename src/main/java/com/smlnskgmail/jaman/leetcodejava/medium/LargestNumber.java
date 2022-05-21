package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/largest-number/
public class LargestNumber {

    private final int[] input;

    public LargestNumber(int[] input) {
        this.input = input;
    }

    public String solution() {
        List<String> values = new ArrayList<>();
        for (int num : input) {
            values.add(String.valueOf(num));
        }
        values.sort((o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        if (values.get(0).equals("0")) {
            return "0";
        }
        var result = new StringBuilder();
        for (String value : values) {
            result.append(value);
        }
        return result.toString();
    }

}
