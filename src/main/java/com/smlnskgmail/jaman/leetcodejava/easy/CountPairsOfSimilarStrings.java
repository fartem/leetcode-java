package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// https://leetcode.com/problems/count-pairs-of-similar-strings/
public class CountPairsOfSimilarStrings {

    private final String[] input;

    public CountPairsOfSimilarStrings(String[] input) {
        this.input = input;
    }

    public int solution() {
        Map<String, String> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < input.length; i++) {
            String curr = input[i];
            checkExists(curr, map);
            String currSet = map.get(curr);
            for (int j = i + 1; j < input.length; j++) {
                String compare = input[j];
                checkExists(compare, map);
                if (currSet.compareTo(map.get(compare)) == 0) {
                    result++;
                }
            }
        }
        return result;
    }

    private void checkExists(String word, Map<String, String> map) {
        if (!map.containsKey(word)) {
            Set<Character> set = new TreeSet<>();
            for (int i = 0; i < word.length(); i++) {
                set.add(word.charAt(i));
            }
            map.put(word, String.valueOf(set));
        }
    }

}
