package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/count-common-words-with-one-occurrence/
public class CountCommonWordsWithOneOccurrence {

    private final String[] words1;
    private final String[] words2;

    public CountCommonWordsWithOneOccurrence(String[] words1, String[] words2) {
        this.words1 = words1;
        this.words2 = words2;
    }

    public int solution() {
        Map<String, Integer> w1 = new HashMap<>();
        for (String word : words1) {
            w1.put(word, w1.getOrDefault(word, 0) + 1);
        }
        Map<String, Integer> w2 = new HashMap<>();
        for (String word : words2) {
            w2.put(word, w2.getOrDefault(word, 0) + 1);
        }
        int result = 0;
        for (Map.Entry<String, Integer> entry : w1.entrySet()) {
            if (entry.getValue() == 1 && w2.getOrDefault(entry.getKey(), 0) == 1) {
                result++;
            }
        }
        return result;
    }

}
