package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/minimum-cuts-to-divide-a-circle/
public class MinimumCutsToDivideACircle {

    private final int input;

    public MinimumCutsToDivideACircle(int input) {
        this.input = input;
    }

    public int solution() {
        return input > 1 ? input % 2 == 0 ? input / 2 : input : 0;
    }

}
