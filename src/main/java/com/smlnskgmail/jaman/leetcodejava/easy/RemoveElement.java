package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/remove-element/
public class RemoveElement {

    private final int[] input;
    private final int value;

    public RemoveElement(int[] input, int value) {
        this.input = input;
        this.value = value;
    }

    public int solution() {
        int index = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != value) {
                input[index] = input[i];
                index++;
            }
        }
        return index;
    }

}
