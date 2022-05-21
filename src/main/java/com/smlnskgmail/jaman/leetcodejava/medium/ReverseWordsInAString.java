package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/reverse-words-in-a-string/
public class ReverseWordsInAString {

    private final String input;

    public ReverseWordsInAString(String input) {
        this.input = input;
    }

    public String solution() {
        List<String> result = new ArrayList<>();
        int pointer = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                String candidate = input.substring(pointer, i).trim();
                if (candidate.length() != 0) {
                    result.add(candidate);
                }
                pointer = i;
            }
        }
        String candidate = input.substring(pointer).trim();
        if (candidate.length() != 0) {
            result.add(candidate);
        }
        Collections.reverse(result);
        return String.join(" ", result);
    }

}
