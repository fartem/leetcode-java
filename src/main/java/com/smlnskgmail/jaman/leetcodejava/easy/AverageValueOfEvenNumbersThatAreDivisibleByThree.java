package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/
public class AverageValueOfEvenNumbersThatAreDivisibleByThree {

    private final int[] input;

    public AverageValueOfEvenNumbersThatAreDivisibleByThree(int[] input) {
        this.input = input;
    }

    public int solution() {
        int count = 0;
        int sum = 0;
        for (int num : input) {
            if (num % 6 == 0) {
                count++;
                sum += num;
            }
        }
        return count != 0 ? sum / count : 0;
    }

}
