package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.LinkedHashMap;
import java.util.Map;

// https://leetcode.com/problems/kth-distinct-string-in-an-array
public class KthDistinctStringInAnArray {

    private final String[] arr;
    private int k;

    public KthDistinctStringInAnArray(String[] arr, int k) {
        this.arr = arr;
        this.k = k;
    }

    public String solution() {
        Map<String, Integer> values = new LinkedHashMap<>();
        for (String str : arr) {
            if (values.containsKey(str)) {
                values.put(str, values.get(str) + 1);
            } else {
                values.put(str, 1);
            }
        }
        for (Map.Entry<String, Integer> value : values.entrySet()) {
            if (value.getValue() == 1) {
                if (k == 1) {
                    return value.getKey();
                } else {
                    k--;
                }
            }
        }
        return "";
    }
}
