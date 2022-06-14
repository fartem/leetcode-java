package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/happy-number/
public class HappyNumber {

    private int input;

    public HappyNumber(int input) {
        this.input = input;
    }

    public boolean solution() {
        Set<Integer> seen = new HashSet<>();
        while (input != 1 && !seen.contains(input)) {
            seen.add(input);
            input = next(input);
        }
        return input == 1;
    }

    private int next(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            n /= 10;
            sum += d * d;
        }
        return sum;
    }

}
