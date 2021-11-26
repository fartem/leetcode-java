package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers
public class ConvertIntegerToTheSumOfTwoNoZeroIntegers {

    private final int input;

    public ConvertIntegerToTheSumOfTwoNoZeroIntegers(int input) {
        this.input = input;
    }

    public int[] solution() {
        int[] result = new int[2];
        for (int i = 1; i < input; i++) {
            int b = input - i;
            boolean aIsValid = !hasZeros(i);
            if (!aIsValid) {
                continue;
            }
            boolean bIsValid = !hasZeros(b);
            if (!bIsValid) {
                continue;
            }
            result[0] = i;
            result[1] = b;
            break;
        }
        return result;
    }

    private boolean hasZeros(int num) {
        while (num != 0) {
            if (num % 10 == 0) {
                return true;
            }
            num /= 10;
        }
        return false;
    }

}
