package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/count-primes/
public class CountPrimes {

    private final int input;

    public CountPrimes(int input) {
        this.input = input;
    }

    public int solution() {
        boolean[] isPrime = new boolean[input];
        for (int i = 2; i < input; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i < input; i++) {
            if (!isPrime[i]) {
                continue;
            }
            for (int j = i * i; j < input; j += i) {
                isPrime[j] = false;
            }
        }
        int count = 0;
        for (int i = 2; i < input; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }

}
