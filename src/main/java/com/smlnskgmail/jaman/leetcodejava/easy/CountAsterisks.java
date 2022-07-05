package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/count-asterisks/
public class CountAsterisks {

    private final String input;

    public CountAsterisks(String input) {
        this.input = input;
    }

    public int solution() {
        int count = 0;
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '|') {
                count++;
            }
            if (count == 2) {
                count = 0;
            }
            if (count == 0) {
                if (c == '*') {
                    result++;
                }
            }
        }
        return result;
    }

}
