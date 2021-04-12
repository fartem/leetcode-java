package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/reverse-only-letters
public class ReverseOnlyLetters {

    private final String input;

    public ReverseOnlyLetters(String input) {
        this.input = input;
    }

    public String solution() {
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char leftChar = chars[left];
            if (!Character.isLetter(leftChar)) {
                left++;
                continue;
            }
            char rightChar = chars[right];
            if (!Character.isLetter(rightChar)) {
                right--;
                continue;
            }
            chars[left] = rightChar;
            chars[right] = leftChar;
            left++;
            right--;
        }
        return String.valueOf(chars);
    }

}
