package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary
public class AverageSalaryExcludingTheMinimumAndMaximumSalary {

    private final int[] input;

    public AverageSalaryExcludingTheMinimumAndMaximumSalary(int[] input) {
        this.input = input;
    }

    public double solution() {
        Arrays.sort(input);
        double sum = 0;
        for (int i = 1; i < input.length - 1; i++) {
            sum += input[i];
        }
        return sum / (input.length - 2);
    }
}
