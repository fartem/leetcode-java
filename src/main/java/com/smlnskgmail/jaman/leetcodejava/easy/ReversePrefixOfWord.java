package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/reverse-prefix-of-word/
public class ReversePrefixOfWord {

    private final String word;
    private final char ch;

    public ReversePrefixOfWord(String word, char ch) {
        this.word = word;
        this.ch = ch;
    }

    public String solution() {
        int target = word.indexOf(ch);
        if (target == -1) {
            return word;
        }
        StringBuilder result = new StringBuilder(word);
        int start = 0;
        while (start < target) {
            char f = result.charAt(start);
            char s = result.charAt(target);
            result.setCharAt(start, s);
            result.setCharAt(target, f);
            start++;
            target--;
        }
        return result.toString();
    }

}
