package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/word-subsets/
public class WordSubsets {

    private final String[] words1;
    private final String[] words2;

    public WordSubsets(String[] words1, String[] words2) {
        this.words1 = words1;
        this.words2 = words2;
    }

    public List<String> solution() {
        int[] bMax = count("");
        for (String b : words2) {
            int[] bCount = count(b);
            for (int i = 0; i < 26; i++) {
                bMax[i] = Math.max(bMax[i], bCount[i]);
            }
        }
        List<String> result = new ArrayList<>();
        search:
        for (String a : words1) {
            int[] aCount = count(a);
            for (int i = 0; i < 26; i++) {
                if (aCount[i] < bMax[i]) {
                    continue search;
                }
            }
            result.add(a);
        }
        return result;
    }

    public int[] count(String s) {
        int[] result = new int[26];
        for (int i = 0; i < s.length(); i++) {
            result[s.charAt(i) - 'a']++;
        }
        return result;
    }

}
