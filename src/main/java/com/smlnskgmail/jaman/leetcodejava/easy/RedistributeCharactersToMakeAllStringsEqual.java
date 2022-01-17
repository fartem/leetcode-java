package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal
public class RedistributeCharactersToMakeAllStringsEqual {

    private final String[] input;

    public RedistributeCharactersToMakeAllStringsEqual(String[] input) {
        this.input = input;
    }

    public boolean solution() {
        int[] letters = new int[26];
        for (String word : input) {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                letters[c - 97] = letters[c - 97] + 1;
            }
        }
        for (int count : letters) {
            if (count != 0) {
                if (count < input.length || count % input.length != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
