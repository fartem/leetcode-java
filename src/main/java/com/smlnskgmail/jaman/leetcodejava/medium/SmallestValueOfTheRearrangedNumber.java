package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/smallest-value-of-the-rearranged-number/
public class SmallestValueOfTheRearrangedNumber {

    private long input;

    public SmallestValueOfTheRearrangedNumber(long input) {
        this.input = input;
    }

    public long solution() {
        if (input == 0) {
            return 0;
        }
        boolean isNeg = input < 0;
        input = Math.abs(input);
        List<Long> digits = new ArrayList<>();
        while (input != 0) {
            long digit = input % 10;
            digits.add(digit);
            input /= 10;
        }
        digits.sort(Long::compare);
        if (isNeg) {
            long result = 0;
            for (int i = digits.size() - 1; i >= 0; i--) {
                result = result * 10 + digits.get(i);
            }
            return -result;
        }
        int start = 0;
        while (digits.get(start) == 0) {
            start++;
        }
        long result = digits.get(start);
        for (int i = 0; i < digits.size(); i++) {
            if (i != start)
                result = result * 10 + digits.get(i);
        }
        return result;
    }

}
