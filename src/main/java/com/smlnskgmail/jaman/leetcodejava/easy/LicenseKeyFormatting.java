package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/license-key-formatting
public class LicenseKeyFormatting {

    private final String s;
    private final int k;

    public LicenseKeyFormatting(String s, int k) {
        this.s = s;
        this.k = k;
    }

    public String solution() {
        StringBuilder key = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '-') {
                key.append(Character.toUpperCase(c));
            }
        }
        if (key.length() == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        int pointer = 0;
        int diff = key.length() % k;
        if (diff != 0) {
            result.append(key, 0, diff);
            result.append('-');
            pointer = diff;
        }
        for (int i = pointer; i < key.length(); i += k) {
            result.append(key, i, i + k);
            result.append('-');
        }
        result.setLength(result.length() - 1);
        return result.toString();
    }

}
