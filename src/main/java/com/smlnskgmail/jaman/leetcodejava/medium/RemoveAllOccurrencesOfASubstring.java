package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/remove-all-occurrences-of-a-substring
public class RemoveAllOccurrencesOfASubstring {

    private final String s;
    private final String part;

    public RemoveAllOccurrencesOfASubstring(String s, String part) {
        this.s = s;
        this.part = part;
    }

    public String solution() {
        var result = new StringBuilder(s);
        var index = result.indexOf(part);
        while (index > -1) {
            result.delete(index, index + part.length());
            index = result.indexOf(part);
        }
        return result.toString();
    }

}
