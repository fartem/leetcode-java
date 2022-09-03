package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/numbers-with-same-consecutive-differences/
public class NumbersWithSameConsecutiveDifferences {

    private final int n;
    private final int k;

    public NumbersWithSameConsecutiveDifferences(int n, int k) {
        this.n = n;
        this.k = k;
    }

    public int[] solution() {
        if (n == 1) {
            return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        }
        List<Integer> nums = new ArrayList<Integer>();
        for (int num = 1; num < 10; num++) {
            dfs(n - 1, num, k, nums);
        }
        int[] result = new int[nums.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = nums.get(i);
        }
        return result;
    }

    private void dfs(int n, int num, int k, List<Integer> nums) {
        if (n == 0) {
            nums.add(num);
            return;
        }
        List<Integer> nextDigits = new ArrayList<>();
        int tail = num % 10;
        nextDigits.add(tail + k);
        if (k != 0) {
            nextDigits.add(tail - k);
        }
        for (int nextDigit : nextDigits) {
            if (0 <= nextDigit && nextDigit < 10) {
                int newNum = num * 10 + nextDigit;
                dfs(n - 1, newNum, k, nums);
            }
        }
    }

}
