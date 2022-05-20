package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
public class FindFirstPalindromicStringInTheArray {

    private final String[] input;

    public FindFirstPalindromicStringInTheArray(String[] input) {
        this.input = input;
    }

    public String solution() {
        for (String word : input) {
            if (isPalindromic(word)) {
                return word;
            }
        }
        return "";
    }

    private boolean isPalindromic(String word) {
        int l = 0;
        int r = word.length() - 1;
        while (l < r) {
            if (word.charAt(l++) != word.charAt(r--)) {
                return false;
            }
        }
        return true;
    }

}
