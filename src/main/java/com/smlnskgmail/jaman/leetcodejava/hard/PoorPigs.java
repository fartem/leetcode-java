package com.smlnskgmail.jaman.leetcodejava.hard;

// https://leetcode.com/problems/poor-pigs/
public class PoorPigs {

    private final int buckets;
    private final int minutesToDie;
    private final int minutesToTest;

    public PoorPigs(int buckets, int minutesToDie, int minutesToTest) {
        this.buckets = buckets;
        this.minutesToDie = minutesToDie;
        this.minutesToTest = minutesToTest;
    }

    public int solution() {
        int time = (minutesToTest / minutesToDie) + 1;
        int result = 0;
        int total = 1;
        while (total < buckets) {
            total *= time;
            result++;
        }
        return result;
    }

}
