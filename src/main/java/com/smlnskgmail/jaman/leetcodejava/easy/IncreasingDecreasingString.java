package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/increasing-decreasing-string
public class IncreasingDecreasingString {

    private final String input;

    public IncreasingDecreasingString(String input) {
        this.input = input;
    }

    public String solution() {
        int[] freq = new int[26];
        int max = 0;
        for (int i = 0; i < input.length(); i++) {
            int c = input.charAt(i) - 97;
            int count = freq[c];
            freq[c] = ++count;
            if (count > max) {
                max = count;
            }
        }
        char[] result = new char[input.length()];
        int pointer = 0;
        while (max != 0) {
            for (int i = 0; i < freq.length; i++) {
                int count = freq[i];
                if (count != 0) {
                    result[pointer++] = (char) (i + 97);
                    freq[i] = count - 1;
                }
            }
            for (int i = freq.length - 1; i >= 0; i--) {
                int count = freq[i];
                if (count != 0) {
                    result[pointer++] = (char) (i + 97);
                    freq[i] = count - 1;
                }
            }
            max--;
        }
        return String.valueOf(result);
    }

}
