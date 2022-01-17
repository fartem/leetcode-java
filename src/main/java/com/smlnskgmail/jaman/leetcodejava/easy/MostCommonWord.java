package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.*;

// https://leetcode.com/problems/most-common-word
public class MostCommonWord {

    private final String paragraph;
    private final String[] banned;

    public MostCommonWord(String paragraph, String[] banned) {
        this.paragraph = paragraph;
        this.banned = banned;
    }

    public String solution() {
        Set<String> ban = new HashSet<>();
        Collections.addAll(ban, banned);
        String mostCommonWord = null;
        StringBuilder word = new StringBuilder();
        int counter = 0;
        Map<String, Integer> wordsWithCount = new HashMap<>();
        String inLowerCase = paragraph.toLowerCase();
        for (int i = 0; i < inLowerCase.length(); i++) {
            char c = inLowerCase.charAt(i);
            if (Character.isLetter(c)) {
                word.append(c);
            } else if (word.length() > 0) {
                String candidate = word.toString();
                word.setLength(0);
                if (!ban.contains(candidate)) {
                    int count = 1;
                    if (wordsWithCount.containsKey(candidate)) {
                        count = wordsWithCount.get(candidate);
                        count++;
                    }
                    wordsWithCount.put(candidate, count);
                    if (counter < count) {
                        counter = count;
                        mostCommonWord = candidate;
                    }
                }
            }
        }
        if (mostCommonWord == null) {
            mostCommonWord = word.toString();
        }
        return mostCommonWord;
    }
}
