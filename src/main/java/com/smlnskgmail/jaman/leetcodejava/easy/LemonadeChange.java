package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/lemonade-change/
public class LemonadeChange {

    private final int[] input;

    public LemonadeChange(int[] input) {
        this.input = input;
    }

    public boolean solution() {
        int five = 0;
        int ten = 0;
        for (int bill : input) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
