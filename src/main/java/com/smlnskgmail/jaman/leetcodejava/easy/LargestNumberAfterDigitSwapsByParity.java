package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/largest-number-after-digit-swaps-by-parity/
public class LargestNumberAfterDigitSwapsByParity {

    private int input;

    public LargestNumberAfterDigitSwapsByParity(int input) {
        this.input = input;
    }

    public int solution() {
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        int ref = input;
        while (input > 0) {
            int curr = input % 10;
            if (curr % 2 != 0) {
                odds.add(curr);
            } else {
                evens.add(curr);
            }
            input /= 10;
        }
        Collections.sort(odds);
        Collections.sort(evens);
        int pO = 0;
        int pE = 0;
        int result = 0;
        int mul = 1;
        while (ref > 0) {
            int curr = ref % 10;
            if (curr % 2 != 0) {
                result = odds.get(pO++) * mul + result;
            } else {
                result = evens.get(pE++) * mul + result;
            }
            ref /= 10;
            mul *= 10;
        }
        return result;
    }

}
