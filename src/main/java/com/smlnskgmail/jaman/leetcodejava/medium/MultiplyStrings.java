package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/multiply-strings/
public class MultiplyStrings {

    private final String num1;
    private final String num2;

    public MultiplyStrings(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String solution() {
        int l1 = num1.length();
        int l2 = num2.length();
        int[] result = new int[l1 + l2];
        int p1 = 0;
        int p2;
        for (int i = l1 - 1; i >= 0; i--) {
            int carry = 0;
            int n1 = num1.charAt(i) - '0';
            p2 = 0;
            for (int j = l2 - 1; j >= 0; j--) {
                int n2 = num2.charAt(j) - '0';
                int sum = n1 * n2 + result[p1 + p2] + carry;
                carry = sum / 10;
                result[p1 + p2] = sum % 10;
                p2++;
            }
            if (carry > 0) {
                result[p1 + p2] += carry;
            }
            p1++;
        }
        int i = result.length - 1;
        while (i >= 0 && result[i] == 0) {
            i--;
        }
        if (i == -1) {
            return "0";
        }
        StringBuilder output = new StringBuilder();
        while (i >= 0) {
            output.append(result[i--]);
        }
        return output.toString();
    }

}
