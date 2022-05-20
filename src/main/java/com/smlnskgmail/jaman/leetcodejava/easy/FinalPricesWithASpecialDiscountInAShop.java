package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
public class FinalPricesWithASpecialDiscountInAShop {

    private final int[] input;

    public FinalPricesWithASpecialDiscountInAShop(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        for (int i = 0; i < input.length; i++) {
            int price = input[i];
            for (int j = i + 1; j < input.length; j++) {
                int discount = input[j];
                if (price >= discount) {
                    input[i] = price - discount;
                    break;
                }
            }
        }
        return input;
    }

}
