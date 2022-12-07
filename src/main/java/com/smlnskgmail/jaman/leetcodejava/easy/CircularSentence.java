package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/circular-sentence/description/
public class CircularSentence {

    private final String input;

    public CircularSentence(String input) {
        this.input = input;
    }

    public boolean solution() {
        String[] words = input.split(" ");
        String first = words[0];
        char curr = first.charAt(first.length() - 1);
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            char last = word.charAt(0);
            if (curr != last) {
                return false;
            }
            curr = word.charAt(word.length() - 1);
        }
        return curr == first.charAt(0);
    }

}
