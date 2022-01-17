package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/check-if-string-is-a-prefix-of-array
public class CheckIfStringIsAPrefixOfArray {

    private final String s;
    private final String[] words;

    public CheckIfStringIsAPrefixOfArray(String s, String[] words) {
        this.s = s;
        this.words = words;
    }

    public boolean solution() {
        int p = 0;
        for (int i = 0; i < words.length && p < s.length(); i++) {
            String word = words[i];
            for (int j = p, k = 0; j < s.length() && k < word.length(); j++, k++) {
                if (s.charAt(j) != word.charAt(k)) {
                    return false;
                }
            }
            p += word.length();
        }
        return p == s.length();
    }
}
