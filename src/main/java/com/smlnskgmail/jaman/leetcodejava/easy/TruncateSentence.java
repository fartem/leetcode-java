package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/truncate-sentence
public class TruncateSentence {

    private final String string;
    private final int k;

    public TruncateSentence(String string, int k) {
        this.string = string;
        this.k = k;
    }

    public String solution() {
        int index = 0;
        int spaces = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                spaces++;
                if (spaces == k) {
                    index = i;
                    break;
                }
            }
        }
        return index == 0 ? string : string.substring(0, index);
    }

}
