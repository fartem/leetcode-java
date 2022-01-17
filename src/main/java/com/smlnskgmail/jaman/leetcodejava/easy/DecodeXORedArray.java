package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/decode-xored-array
public class DecodeXORedArray {

    private final int[] encoded;
    private final int first;

    public DecodeXORedArray(int[] encoded, int first) {
        this.encoded = encoded;
        this.first = first;
    }

    public int[] solution() {
        int[] result = new int[encoded.length + 1];
        result[0] = first;
        for (int i = 1; i < result.length; i++) {
            result[i] = result[i - 1] ^ encoded[i - 1];
        }
        return result;
    }
}
