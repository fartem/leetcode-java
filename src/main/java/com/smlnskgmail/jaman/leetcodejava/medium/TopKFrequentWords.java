package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/top-k-frequent-words
public class TopKFrequentWords {

    private final String[] words;
    private final int k;

    public TopKFrequentWords(String[] words, int k) {
        this.words = words;
        this.k = k;
    }

    public List<String> solution() {
        Map<String, Integer> values = new HashMap<>();
        for (String word : words) {
            int count = 1;
            if (values.containsKey(word)) {
                count = values.get(word);
            }
            values.put(word, ++count);
        }
        List<Map.Entry<String, Integer>> toSort = new ArrayList<>(values.entrySet());
        toSort.sort((a, b) -> {
            int diff = b.getValue() - a.getValue();
            if (diff == 0) {
                return a.getKey().compareTo(b.getKey());
            }
            return diff;
        });
        List<String> result = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            result.add(toSort.get(i).getKey());
        }
        return result;
    }

}
