package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/most-frequent-subtree-sum/
public class MostFrequentSubtreeSum {

    private final TreeNode input;
    private int freq = 0;

    public MostFrequentSubtreeSum(TreeNode input) {
        this.input = input;
    }

    public int[] solution() {
        Map<Integer, Integer> values = new HashMap<>();
        fillValues(input, values);
        List<Integer> mostFreq = new ArrayList<>();
        for (Map.Entry<Integer, Integer> value : values.entrySet()) {
            if (value.getValue() == freq) {
                mostFreq.add(value.getKey());
            }
        }
        int[] result = new int[mostFreq.size()];
        for (int i = 0; i < mostFreq.size(); i++) {
            result[i] = mostFreq.get(i);
        }
        return result;
    }

    private int fillValues(TreeNode node, Map<Integer, Integer> values) {
        if (node != null) {
            int left = fillValues(node.left, values);
            int right = fillValues(node.right, values);
            int sum = node.val + left + right;
            values.put(sum, values.getOrDefault(sum, 0) + 1);
            freq = Math.max(freq, values.get(sum));
            return sum;
        }
        return 0;
    }

}
