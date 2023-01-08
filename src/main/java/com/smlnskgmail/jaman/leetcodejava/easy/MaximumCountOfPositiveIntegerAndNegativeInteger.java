package com.smlnskgmail.jaman.leetcodejava.easy;

class MaximumCountOfPositiveIntegerAndNegativeInteger {

    private final int[] input;

    MaximumCountOfPositiveIntegerAndNegativeInteger(int[] input) {
        this.input = input;
    }

    public int solution() {
        int pos = 0;
        int neg = 0;
        for (int num : input) {
            if (num > 0) {
                pos++;
            } else if (num < 0) {
                neg++;
            }
        }
        return Math.max(pos, neg);
    }

}
