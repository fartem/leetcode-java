package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/binary-gap
public class BinaryGap {

    private final int input;

    public BinaryGap(int input) {
        this.input = input;
    }

    public int solution() {
        String binary = Integer.toString(input, 2);
        int distance = 0;
        int count = 0;
        boolean isCounting = false;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                if (isCounting) {
                    distance = Math.max(distance, ++count);
                    count = 0;
                } else {
                    isCounting = true;
                }
            } else if (isCounting) {
                count++;
            }
        }
        return distance;
    }

}
