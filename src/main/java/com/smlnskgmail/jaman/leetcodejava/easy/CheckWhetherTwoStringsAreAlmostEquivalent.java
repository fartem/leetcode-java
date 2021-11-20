package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent
public class CheckWhetherTwoStringsAreAlmostEquivalent {

    private final String word1;
    private final String word2;

    public CheckWhetherTwoStringsAreAlmostEquivalent(
            String word1,
            String word2
    ) {
        this.word1 = word1;
        this.word2 = word2;
    }

    public boolean solution() {
        int[] chars1 = new int[26];
        int[] chars2 = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            chars1[word1.charAt(i) - 97]++;
            chars2[word2.charAt(i) - 97]++;
        }
        for (int i = 0; i < chars1.length; i++) {
            if (Math.abs(chars1[i] - chars2[i]) > 3) {
                return false;
            }
        }
        return true;
    }

}
