package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/count-the-number-of-consistent-strings/
public class CountTheNumberOfConsistentStrings {

    private final String allowed;
    private final String[] words;

    public CountTheNumberOfConsistentStrings(String allowed, String[] words) {
        this.allowed = allowed;
        this.words = words;
    }

    public int solution() {
        Set<Character> allowedChars = new HashSet<>(words.length);
        for (int i = 0; i < allowed.length(); i++) {
            allowedChars.add(allowed.charAt(i));
        }
        int result = words.length;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (!allowedChars.contains(word.charAt(i))) {
                    result--;
                    break;
                }
            }
        }
        return result;
    }

}
