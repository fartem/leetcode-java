package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/next-greater-element-iii/
public class NextGreaterElementIII {

    private final int input;

    public NextGreaterElementIII(int input) {
        this.input = input;
    }

    public int solution() {
        char[] digits = ("" + input).toCharArray();
        int i = digits.length - 2;
        while (i >= 0 && digits[i + 1] <= digits[i]) {
            i--;
        }
        if (i < 0) {
            return -1;
        }
        int j = digits.length - 1;
        while (j >= 0 && digits[j] <= digits[i]) {
            j--;
        }
        swap(digits, i, j);
        reverse(digits, i + 1, digits.length - 1);
        long result = Long.parseLong(new String(digits));
        return result > Integer.MAX_VALUE ? -1 : (int) result;
    }

    private void swap(char[] digits, int f, int s) {
        char t = digits[f];
        digits[f] = digits[s];
        digits[s] = t;
    }

    private void reverse(char[] digits, int l, int r) {
        while (l < r) {
            swap(digits, l++, r--);
        }
    }


}
