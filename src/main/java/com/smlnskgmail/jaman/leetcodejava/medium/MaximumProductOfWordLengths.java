package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/maximum-product-of-word-lengths
public class MaximumProductOfWordLengths {

    private final String[] input;

    public MaximumProductOfWordLengths(String[] input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        Map<String, int[]> letters = new HashMap<>();
        for (String word : input) {
            int[] l = new int[26];
            for (int j = 0; j < word.length(); j++) {
                l[word.charAt(j) - 97]++;
            }
            letters.put(word, l);
        }
        for (int i = 0; i < input.length; i++) {
            String word = input[i];
            int[] wLetters = letters.get(word);
            for (int k = 0; k < input.length; k++) {
                if (k != i) {
                    String candidate = input[k];
                    int[] cLetters = letters.get(candidate);
                    boolean correct = true;
                    for (int m = 0; m < wLetters.length; m++) {
                        if (wLetters[m] != 0 && cLetters[m] != 0) {
                            correct = false;
                            break;
                        }
                    }
                    if (correct) {
                        result = Math.max(result, word.length() * candidate.length());
                    }
                }
            }
        }
        return result;
    }

}
