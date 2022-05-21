package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/unique-morse-code-words/
public class UniqueMorseCodeWords {

    private static final String[] ALPHABET = new String[]{
            ".-",
            "-...",
            "-.-.",
            "-..",
            ".",
            "..-.",
            "--.",
            "....",
            "..",
            ".---",
            "-.-",
            ".-..",
            "--",
            "-.",
            "---",
            ".--.",
            "--.-",
            ".-.",
            "...",
            "-",
            "..-",
            "...-",
            ".--",
            "-..-",
            "-.--",
            "--.."
    };

    private final String[] input;

    public UniqueMorseCodeWords(String[] input) {
        this.input = input;
    }

    public int solution() {
        Set<String> uniq = new HashSet<>();
        for (String word : input) {
            StringBuilder code = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                int pos = word.charAt(i);
                code.append(ALPHABET[pos - 97]);
            }
            uniq.add(code.toString());
        }
        return uniq.size();
    }

}
