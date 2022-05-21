package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros/
public class LongerContiguousSegmentsOfOnesThanZeros {

    private final String input;

    public LongerContiguousSegmentsOfOnesThanZeros(String input) {
        this.input = input;
    }

    public boolean solution() {
        int ones = 0;
        int zeros = 0;
        int onesTemp = 0;
        int zerosTemp = 0;
        for (int i = 0; i < input.length(); i++) {
            int digit = input.charAt(i) - '0';
            if (digit == 1) {
                if (zerosTemp != 0) {
                    if (zerosTemp > zeros) {
                        zeros = zerosTemp;
                    }
                    zerosTemp = 0;
                }
                onesTemp++;
            } else {
                if (onesTemp != 0) {
                    if (onesTemp > ones) {
                        ones = onesTemp;
                    }
                    onesTemp = 0;
                }
                zerosTemp++;
            }
        }
        return Math.max(ones, onesTemp) > Math.max(zeros, zerosTemp);
    }

}
