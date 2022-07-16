package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/decode-string/
public class DecodeString {

    private final String input;

    public DecodeString(String input) {
        this.input = input;
    }

    public String solution() {
        return decodeString(input);
    }

    public String decodeString(String s) {
        int last = s.lastIndexOf('[');
        if (last < 0) {
            return s;
        }
        int p = last - 1;
        while (p >= 0) {
            if (Character.isDigit(s.charAt(p))) {
                p--;
            } else {
                break;
            }
        }
        int count = Integer.parseInt(s.substring(p + 1, last));
        String rS = s.substring(last + 1, s.indexOf(']', last));
        rS = rS.repeat(count);
        s = s.replace((s.substring(p + 1, s.indexOf(']', p + 1) + 1)), rS);
        return decodeString(s);
    }

}
