package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/decompress-run-length-encoded-list/
public class DecompressRunLengthEncodedList {

    private final int[] input;

    public DecompressRunLengthEncodedList(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        int length = 0;
        for (int i = 0; i < input.length; i += 2) {
            length += input[i];
        }
        int[] result = new int[length];
        int pointer = 0;
        for (int i = 0; i < input.length; i += 2) {
            int freq = input[i];
            int val = input[i + 1];
            for (int j = 0; j < freq; j++) {
                result[pointer] = val;
                pointer++;
            }
        }
        return result;
    }

}
