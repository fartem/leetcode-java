package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.*;

// https://leetcode.com/problems/top-k-frequent-elements
public class TopKFrequentElements {

    private final int[] nums;
    private final int k;

    public TopKFrequentElements(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
    }

    public int[] solution() {
        Map<Integer, Integer> values = new HashMap<>();
        for (int num : nums) {
            int count = 1;
            if (values.containsKey(num)) {
                count = values.get(num);
            }
            values.put(num, ++count);
        }
        Queue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry::getValue)
        );
        for (var entry : values.entrySet()) {
            queue.add(entry);
            if (queue.size() > k) {
                queue.remove();
            }
        }
        int[] result = new int[k];
        int i = 0;
        while (!queue.isEmpty()) {
            result[i++] = queue.remove().getKey();
        }
        return result;
    }

}
