package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words/
public class LongestPalindromeByConcatenatingTwoLetterWords {

    private final String[] input;

    public LongestPalindromeByConcatenatingTwoLetterWords(String[] input) {
        this.input = input;
    }

    public int solution() {
        int[][] freq = new int[26][26];
        int result = 0;
        for (String word : input) {
            int a = word.charAt(0) - 'a';
            int b = word.charAt(1) - 'a';
            if (freq[b][a] > 0) {
                result += 4;
                freq[b][a]--;
            } else {
                freq[a][b]++;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][i] > 0) {
                result += 2;
                break;
            }
        }
        return result;
    }

}
