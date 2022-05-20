package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/count-integers-with-even-digit-sum/
public class CountIntegersWithEvenDigitSum {

    private final int input;

    public CountIntegersWithEvenDigitSum(int input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        for (int i = 1; i <= input; i++) {
            int curr = i;
            int sum = 0;
            while (curr != 0) {
                int part = curr % 10;
                sum += part;
                curr /= 10;
            }
            if (sum % 2 == 0) {
                result++;
            }
        }
        return result;
    }

}
