package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/intervals-between-identical-elements/
public class IntervalsBetweenIdenticalElements {

    private final int[] arr;

    public IntervalsBetweenIdenticalElements(int[] input) {
        this.arr = input;
    }

    public long[] solution() {
        Map<Integer, List<Integer>> numsWithIndices = new HashMap<>();
        Map<Integer, long[]> front = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            numsWithIndices.computeIfAbsent(num, indices -> new ArrayList<>()).add(i);
            if (front.containsKey(num)) {
                long[] count = front.get(num);
                count[1] += (i - count[0]);
                front.put(num, count);
            } else {
                front.put(num, new long[]{i, 0});
            }
        }
        long[] result = new long[arr.length];
        for (int key : numsWithIndices.keySet()) {
            List<Integer> indices = numsWithIndices.get(key);
            long[] count = front.get(key);
            result[(int) count[0]] = count[1];
            for (int i = 1; i < indices.size(); i++) {
                int index = indices.get(i);
                int prevIndex = indices.get(i - 1);
                int size = indices.size();
                count[1] = count[1] - ((size - i - 1) * (index - prevIndex)) + ((i - 1) * (index - prevIndex));
                result[index] = count[1];
            }
        }
        return result;
    }

}
