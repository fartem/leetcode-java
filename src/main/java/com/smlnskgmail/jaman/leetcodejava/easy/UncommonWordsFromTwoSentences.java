package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/uncommon-words-from-two-sentences/
public class UncommonWordsFromTwoSentences {

    private final String firstString;
    private final String secondString;

    public UncommonWordsFromTwoSentences(String firstString, String secondString) {
        this.firstString = firstString;
        this.secondString = secondString;
    }

    public String[] solution() {
        int uniqCount = 0;
        Set<String> uniq = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for (String word : firstString.split(" ")) {
            if (uniq.contains(word)) {
                uniq.remove(word);
                duplicates.add(word);
                uniqCount--;
            } else if (!duplicates.contains(word)) {
                uniqCount++;
                uniq.add(word);
            }
        }
        for (String word : secondString.split(" ")) {
            if (uniq.contains(word)) {
                uniq.remove(word);
                duplicates.add(word);
                uniqCount--;
            } else if (!duplicates.contains(word)) {
                uniqCount++;
                uniq.add(word);
            }
        }
        String[] result = new String[uniq.size()];
        for (String uniqWord : uniq) {
            result[result.length - uniqCount] = uniqWord;
            uniqCount--;
        }
        return result;
    }

}
