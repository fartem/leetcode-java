package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/adding-spaces-to-a-string
public class AddingSpacesToAString {

    private final String s;
    private final int[] spaces;

    public AddingSpacesToAString(String s, int[] spaces) {
        this.s = s;
        this.spaces = spaces;
    }

    public String solution() {
        int start = 0;
        StringBuilder result = new StringBuilder();
        for (int space : spaces) {
            String sub = s.substring(start, space);
            result.append(sub).append(" ");
            start = space;
        }
        result.append(s.substring(start));
        return result.toString();
    }
}
