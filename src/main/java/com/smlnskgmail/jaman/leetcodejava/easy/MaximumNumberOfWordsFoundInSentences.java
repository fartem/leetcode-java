package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
public class MaximumNumberOfWordsFoundInSentences {

    private final String[] input;

    public MaximumNumberOfWordsFoundInSentences(String[] input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        for (String sentence : input) {
            int count = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    count++;
                }
            }
            result = Math.max(result, count);
        }
        return result + 1;
    }

}
