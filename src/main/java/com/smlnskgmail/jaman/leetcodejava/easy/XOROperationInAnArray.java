package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/xor-operation-in-an-array/
public class XOROperationInAnArray {

    private final int number;
    private final int start;

    public XOROperationInAnArray(int number, int start) {
        this.number = number;
        this.start = start;
    }

    public int solution() {
        int result = 0;
        int i = 0;
        while (i != number) {
            result ^= start + 2 * i;
            i++;
        }
        return result;
    }

}
