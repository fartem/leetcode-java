package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/construct-the-rectangle/
public class ConstructTheRectangle {

    private final int input;

    public ConstructTheRectangle(int input) {
        this.input = input;
    }

    public int[] solution() {
        for (int i = (int) Math.sqrt(input); i >= 1; i--) {
            if (input % i == 0) {
                return new int[]{input / i, i};
            }
        }
        return null;
    }

}
