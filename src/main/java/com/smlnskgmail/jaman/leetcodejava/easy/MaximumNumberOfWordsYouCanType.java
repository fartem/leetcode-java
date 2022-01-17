package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/maximum-number-of-words-you-can-type
public class MaximumNumberOfWordsYouCanType {

    private final String text;
    private final String brokenLetters;

    public MaximumNumberOfWordsYouCanType(String text, String brokenLetters) {
        this.text = text;
        this.brokenLetters = brokenLetters;
    }

    public int solution() {
        String[] words = text.split(" ");
        int result = words.length;
        int[] chars = new int[26];
        for (int i = 0; i < brokenLetters.length(); i++) {
            chars[brokenLetters.charAt(i) - 97] = 1;
        }
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (chars[word.charAt(i) - 97] == 1) {
                    result--;
                    break;
                }
            }
        }
        return result;
    }
}
