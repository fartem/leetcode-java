package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/reverse-string/
public class ReverseString {

    private final char[] input;

    public ReverseString(char[] input) {
        this.input = input;
    }

    public void solution() {
        int max = input.length - 1;
        for (int i = 0; i < input.length / 2; i++) {
            char temp = input[i];
            input[i] = input[max - i];
            input[max - i] = temp;
        }
    }

}
