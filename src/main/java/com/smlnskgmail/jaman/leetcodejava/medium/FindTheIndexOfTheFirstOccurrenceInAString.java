package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/implement-strstr/
public class FindTheIndexOfTheFirstOccurrenceInAString {

    private final String haystack;
    private final String needle;

    public FindTheIndexOfTheFirstOccurrenceInAString(String haystack, String needle) {
        this.haystack = haystack;
        this.needle = needle;
    }

    public int solution() {
        if (needle.isEmpty()) {
            return 0;
        }
        int needleLength = needle.length();
        char needleFirst = needle.charAt(0);
        char needleLast = needle.charAt(needleLength - 1);
        for (int i = 0; i < haystack.length() - needleLength + 1; i++) {
            if (haystack.charAt(i) == needleFirst && haystack.charAt(i + needleLength - 1) == needleLast) {
                String sub = haystack.substring(i, i + needleLength);
                if (sub.equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

}
