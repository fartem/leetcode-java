package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/
public class CheckIFNumbersAreAscendingInASentence {

    private final String input;

    public CheckIFNumbersAreAscendingInASentence(String input) {
        this.input = input;
    }

    public boolean solution() {
        String[] words = input.split(" ");
        int prev = -1;
        for (String word : words) {
            if (Character.isDigit(word.charAt(0))) {
                int num = Integer.parseInt(word);
                if (prev >= num) {
                    return false;
                } else {
                    prev = num;
                }
            }
        }
        return true;
    }

}
