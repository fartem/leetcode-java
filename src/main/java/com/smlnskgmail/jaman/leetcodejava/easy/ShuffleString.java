package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/shuffle-string/
public class ShuffleString {

    private final String string;
    private final int[] indices;

    public ShuffleString(String string, int[] indices) {
        this.string = string;
        this.indices = indices;
    }

    public String solution() {
        StringBuilder result = new StringBuilder(" ".repeat(indices.length));
        for (int i = 0; i < indices.length; i++) {
            result.setCharAt(indices[i], string.charAt(i));
        }
        return result.toString();
    }

}
