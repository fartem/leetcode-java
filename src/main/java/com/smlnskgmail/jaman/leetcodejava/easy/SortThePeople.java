package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/sort-the-people/
public class SortThePeople {

    private final String[] names;
    private final int[] heights;

    public SortThePeople(String[] names, int[] heights) {
        this.names = names;
        this.heights = heights;
    }

    public String[] solution() {
        Map<Integer, Integer> values = new HashMap<>();
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            values.put(height, i);
        }
        Arrays.sort(heights);
        String[] result = new String[names.length];
        int p = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            result[p++] = names[values.get(heights[i])];
        }
        return result;
    }

}
