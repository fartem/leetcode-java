package com.smlnskgmail.jaman.leetcodejava.hard;

// https://leetcode.com/problems/count-vowels-permutation/
public class CountVowelsPermutation {

    private final int input;

    public CountVowelsPermutation(int input) {
        this.input = input;
    }

    public int solution() {
        long a = 1;
        long e = 1;
        long i = 1;
        long o = 1;
        long u = 1;
        long a2;
        long e2;
        long i2;
        long o2;
        long u2;
        long mod = (long) Math.pow(10, 9) + 7;
        for (int j = 2; j <= input; j++) {
            a2 = (e + i + u) % mod;
            e2 = (a + i) % mod;
            i2 = (e + o) % mod;
            o2 = i;
            u2 = (o + i) % mod;

            a = a2;
            e = e2;
            i = i2;
            o = o2;
            u = u2;
        }
        return (int) ((a + e + i + o + u) % mod);
    }

}
