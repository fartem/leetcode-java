package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/replace-words
public class ReplaceWords {

    private final List<String> dictionary;
    private final String sentence;

    public ReplaceWords(List<String> dictionary, String sentence) {
        this.dictionary = dictionary;
        this.sentence = sentence;
    }

    public String solution() {
        Set<String> roots = new HashSet<>(dictionary);
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            String insertWord = word;
            for (int i = 1; i <= word.length(); i++) {
                String sub = word.substring(0, i);
                if (roots.contains(sub)) {
                    insertWord = sub;
                    break;
                }
            }
            result.append(insertWord).append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }

}
