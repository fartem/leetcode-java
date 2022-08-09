package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/binary-trees-with-factors/
public class BinaryTreesWithFactors {

    private final int[] input;

    public BinaryTreesWithFactors(int[] input) {
        this.input = input;
    }

    public int solution() {
        int mod = 1_000_000_007;
        int length = input.length;
        Arrays.sort(input);
        long[] dp = new long[length];
        Arrays.fill(dp, 1);
        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < length; i++) {
            index.put(input[i], i);
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (input[i] % input[j] == 0) {
                    int r = input[i] / input[j];
                    if (index.containsKey(r)) {
                        dp[i] = (dp[i] + dp[j] * dp[index.get(r)]) % mod;
                    }
                }
            }
        }
        long result = 0;
        for (long x : dp) {
            result += x;
        }
        return (int) (result % mod);
    }

}
