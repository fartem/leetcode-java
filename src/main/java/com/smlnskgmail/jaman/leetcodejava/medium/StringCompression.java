package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/string-compression/
public class StringCompression {

    private final char[] input;

    public StringCompression(char[] input) {
        this.input = input;
    }

    public int solution() {
        char prev = input[0];
        int prevCount = 1;
        List<Character> charsWithCount = new ArrayList<>();
        for (int i = 1; i < input.length; i++) {
            char candidate = input[i];
            if (prev == candidate) {
                prevCount++;
            } else {
                charsWithCount.add(prev);
                if (prevCount > 1) {
                    String c = String.valueOf(prevCount);
                    for (int j = 0; j < c.length(); j++) {
                        charsWithCount.add(c.charAt(j));
                    }
                }
                prev = candidate;
                prevCount = 1;
            }
        }
        charsWithCount.add(prev);
        if (prevCount > 1) {
            String c = String.valueOf(prevCount);
            for (int j = 0; j < c.length(); j++) {
                charsWithCount.add(c.charAt(j));
            }
        }
        for (int i = 0; i < charsWithCount.size(); i++) {
            input[i] = charsWithCount.get(i);
        }
        return charsWithCount.size();
    }

}
