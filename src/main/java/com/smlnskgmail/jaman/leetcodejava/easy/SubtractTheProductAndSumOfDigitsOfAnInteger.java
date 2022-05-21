package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    private int input;

    public SubtractTheProductAndSumOfDigitsOfAnInteger(int input) {
        this.input = input;
    }

    public int solution() {
        int product = 1;
        int sum = 0;
        while (input != 0) {
            int num = input % 10;
            product *= num;
            sum += num;
            input /= 10;
        }
        return product - sum;
    }

}
