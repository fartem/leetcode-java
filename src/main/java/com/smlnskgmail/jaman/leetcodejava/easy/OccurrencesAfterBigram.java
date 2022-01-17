package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/occurrences-after-bigram
public class OccurrencesAfterBigram {

    private final String text;
    private final String first;
    private final String second;

    public OccurrencesAfterBigram(String text, String first, String second) {
        this.text = text;
        this.first = first;
        this.second = second;
    }

    public String[] solution() {
        List<String> result = new ArrayList<>();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length - 2; i++) {
            if (words[i].equals(first) && words[i + 1].equals(second)) {
                result.add(words[i + 2]);
            }
        }
        return result.toArray(new String[0]);
    }
}
