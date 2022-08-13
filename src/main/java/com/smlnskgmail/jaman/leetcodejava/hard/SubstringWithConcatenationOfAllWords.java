package com.smlnskgmail.jaman.leetcodejava.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/substring-with-concatenation-of-all-words/
public class SubstringWithConcatenationOfAllWords {

    private final Map<String, Integer> wordCount = new HashMap<>();
    private int wordLength;
    private int substringSize;
    private int k;
    private final String s;
    private final String[] words;

    public SubstringWithConcatenationOfAllWords(String s, String[] words) {
        this.s = s;
        this.words = words;
    }

    public List<Integer> solution() {
        int n = s.length();
        k = words.length;
        wordLength = words[0].length();
        substringSize = wordLength * k;
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n - substringSize + 1; i++) {
            if (check(i, s)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean check(int i, String s) {
        Map<String, Integer> rem = new HashMap<>(wordCount);
        int wordsUsed = 0;
        for (int j = i; j < i + substringSize; j += wordLength) {
            String sub = s.substring(j, j + wordLength);
            if (rem.getOrDefault(sub, 0) != 0) {
                rem.put(sub, rem.get(sub) - 1);
                wordsUsed++;
            } else {
                break;
            }
        }
        return wordsUsed == k;
    }

}
