package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/
public class MinimumNumberOfStepsToMakeTwoStringsAnagram {

    private final String s;
    private final String t;

    public MinimumNumberOfStepsToMakeTwoStringsAnagram(String s, String t) {
        this.s = s;
        this.t = t;
    }

    public int solution() {
        int[] sLetters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sLetters[s.charAt(i) - 97]++;
        }
        int[] tLetters = new int[26];
        for (int i = 0; i < t.length(); i++) {
            tLetters[t.charAt(i) - 97]++;
        }
        int result = 0;
        for (int i = 0; i < sLetters.length; i++) {
            int sCount = sLetters[i];
            int tCount = tLetters[i];
            if (sCount > tCount) {
                result += sCount - tCount;
            }
        }
        return result;
    }

}
