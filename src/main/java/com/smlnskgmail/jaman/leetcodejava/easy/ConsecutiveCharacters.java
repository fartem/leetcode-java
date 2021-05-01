package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/consecutive-characters
public class ConsecutiveCharacters {

    private final String input;

    public ConsecutiveCharacters(String input) {
        this.input = input;
    }

    public int solution() {
        int max = 1;
        int counter = 1;
        char prev = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            char c = input.charAt(i);
            if (prev == c) {
                counter++;
            } else {
                if (counter > max) {
                    max = counter;
                }
                counter = 1;
            }
            prev = c;
        }
        return Math.max(max, counter);
    }

}
