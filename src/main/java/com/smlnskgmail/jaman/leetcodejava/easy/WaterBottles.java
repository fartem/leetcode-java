package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/water-bottles/
public class WaterBottles {

    private final int numBottles;
    private final int numExchange;

    public WaterBottles(int numBottles, int numExchange) {
        this.numBottles = numBottles;
        this.numExchange = numExchange;
    }

    public int solution() {
        int result = numBottles;
        int eBottles = numBottles;
        while (eBottles >= numExchange) {
            int portion = eBottles / numExchange;
            result += portion;
            eBottles -= portion * numExchange;
            eBottles += portion;
        }
        return result;
    }

}
