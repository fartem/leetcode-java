package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/number-of-lines-to-write-string/
public class NumberOfLinesToWriteString {

    private final int[] widths;
    private final String s;

    public NumberOfLinesToWriteString(int[] widths, String s) {
        this.widths = widths;
        this.s = s;
    }

    public int[] solution() {
        int lines = 1;
        int width = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int w = widths[c - 'a'];
            width += w;
            if (width > 100) {
                lines++;
                width = w;
            }
        }
        return new int[]{lines, width};
    }

}
