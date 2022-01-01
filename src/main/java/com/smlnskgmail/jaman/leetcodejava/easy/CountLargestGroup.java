package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/count-largest-group
public class CountLargestGroup {

    private final int input;

    public CountLargestGroup(int input) {
        this.input = input;
    }

    public int solution() {
        int[] sums = new int[input];
        for (int i = 1; i <= input; i++) {
            sums[sumOfDigits(i) - 1]++;
        }
        int max = 0;
        int count = 0;
        for (int sum : sums) {
            if (sum > max) {
                max = sum;
                count = 1;
            } else if (sum == max) {
                count++;
            }
        }
        return count;
    }

    private int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

}
