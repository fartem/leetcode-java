package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/maximum-repeating-substring
public class MaximumRepeatingSubstring {

    private final String sequence;
    private final String word;

    public MaximumRepeatingSubstring(String sequence, String word) {
        this.sequence = sequence;
        this.word = word;
    }

    public int solution() {
        int result = 0;
        for (int i = 0; i <= sequence.length() - word.length(); i++) {
            if (sequence.charAt(i) == word.charAt(0)) {
                String substring = sequence.substring(i, i + word.length());
                int counter = 0;
                if (substring.equals(word)) {
                    counter++;
                    int tempPointer = i + word.length();
                    while (tempPointer + word.length() <= sequence.length()
                            && sequence.startsWith(word, tempPointer)) {
                        tempPointer += word.length();
                        counter++;
                    }
                }
                result = Math.max(counter, result);
            }
        }
        return result;
    }
}
