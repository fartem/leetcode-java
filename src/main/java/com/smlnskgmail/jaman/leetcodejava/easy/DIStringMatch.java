package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/di-string-match/
public class DIStringMatch {

    private final String input;

    public DIStringMatch(String input) {
        this.input = input;
    }

    public int[] solution() {
        int length = input.length();
        int[] result = new int[length + 1];
        int l = 0;
        int h = length;
        for (int i = 0; i < length; i++) {
            if (input.charAt(i) == 'I') {
                result[i] = l++;
            } else {
                result[i] = h--;
            }
        }
        result[length] = l;
        return result;
    }

}
