package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/integer-to-roman
public class IntegerToRoman {

    private int num;

    public IntegerToRoman(int input) {
        this.num = input;
    }

    public String solution() {
        StringBuilder result = new StringBuilder();
        num = append(result, num, "M", 1000);
        num = append(result, num, "CM", 900);
        num = append(result, num, "D", 500);
        num = append(result, num, "CD", 400);
        num = append(result, num, "C", 100);
        num = append(result, num, "XC", 90);
        num = append(result, num, "L", 50);
        num = append(result, num, "XL", 40);
        num = append(result, num, "X", 10);
        num = append(result, num, "IX", 9);
        num = append(result, num, "V", 5);
        num = append(result, num, "IV", 4);
        num = append(result, num, "I", 1);
        return result.toString();
    }

    private int append(StringBuilder builder, int num, String letter, int letterValue) {
        while (num >= letterValue) {
            builder.append(letter);
            num -= letterValue;
        }
        return num;
    }

}
