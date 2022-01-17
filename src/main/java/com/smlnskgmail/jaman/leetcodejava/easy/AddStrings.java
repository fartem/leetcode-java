package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/add-strings
public class AddStrings {

    private final String num1;
    private final String num2;

    public AddStrings(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String solution() {
        StringBuilder result = new StringBuilder();
        int num1Pointer = num1.length() - 1;
        int num2Pointer = num2.length() - 1;
        int addition = 0;
        while (num1Pointer >= 0 || num2Pointer >= 0) {
            int firstNum = getNextNum(num1, num1Pointer);
            int secondNum = getNextNum(num2, num2Pointer);
            int sum = firstNum + secondNum;
            if (addition == 1) {
                sum += addition;
                addition = 0;
            }
            if (sum >= 10) {
                sum -= 10;
                addition = 1;
            }
            result.append(sum);
            num1Pointer--;
            num2Pointer--;
        }
        if (addition == 1) {
            result.append(addition);
        }
        return result.reverse().toString();
    }

    private int getNextNum(String num, int index) {
        if (index < 0) {
            return 0;
        }
        return Character.getNumericValue(num.charAt(index));
    }
}
