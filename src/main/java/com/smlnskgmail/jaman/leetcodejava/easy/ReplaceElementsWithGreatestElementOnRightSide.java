package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
public class ReplaceElementsWithGreatestElementOnRightSide {

    private final int[] input;

    public ReplaceElementsWithGreatestElementOnRightSide(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        int length = input.length;
        int index = 0;
        int max = 0;
        for (int i = 0; i < length - 1; i++) {
            if (i < index) {
                input[i] = max;
            } else {
                max = 0;
                for (int j = i + 1; j < length; j++) {
                    int num = input[j];
                    if (num > max) {
                        max = num;
                        index = j;
                    }
                }
                input[i] = max;
            }
        }
        input[length - 1] = -1;
        return input;
    }

}
