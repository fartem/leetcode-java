package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/rearrange-spaces-between-words
public class RearrangeSpacesBetweenWords {

    private final String input;

    public RearrangeSpacesBetweenWords(String input) {
        this.input = input;
    }

    public String solution() {
        List<String> words = new ArrayList<>();
        int spaces = 0;
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ' ') {
                spaces++;
                if (word.length() > 0) {
                    words.add(word.toString());
                    word.setLength(0);
                }
            } else {
                word.append(c);
            }
        }
        if (word.length() > 0) {
            words.add(word.toString());
        }
        if (spaces == 0 || words.size() == 0) {
            return input;
        }
        if (words.size() == 1) {
            return words.get(0) + " ".repeat(spaces);
        }
        int actualSpaces = spaces / (words.size() - 1);
        String space = " ".repeat(actualSpaces);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            result.append(words.get(i));
            if (i != words.size() - 1) {
                result.append(space);
            }
        }
        while (result.length() < input.length()) {
            result.append(' ');
        }
        return result.toString();
    }
}
