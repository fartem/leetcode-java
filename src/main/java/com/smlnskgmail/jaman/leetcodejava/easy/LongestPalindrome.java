package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/longest-palindrome
public class LongestPalindrome {

    private final String input;

    public LongestPalindrome(String input) {
        this.input = input;
    }

    public int solution() {
        int[] letters = new int[52];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c < 91) {
                letters[c - 65] = letters[c - 65] + 1;
            } else {
                letters[c - 71] = letters[c - 71] + 1;
            }
        }
        int result = 0;
        int middle = 0;
        for (int num : letters) {
            if (num % 2 == 0) {
                result += num;
            } else {
                if (num - 1 != 0) {
                    result += num - 1;
                }
                middle = 1;
            }
        }
        return result + middle;
    }

}
