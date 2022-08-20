package com.smlnskgmail.jaman.leetcodejava.hard;

// https://leetcode.com/problems/minimum-number-of-refueling-stops/
public class MinimumNumberOfRefuelingStops {

    private final int target;
    private final int startFuel;
    private final int[][] stations;

    public MinimumNumberOfRefuelingStops(int target, int startFuel, int[][] stations) {
        this.target = target;
        this.startFuel = startFuel;
        this.stations = stations;
    }

    public int solution() {
        int n = stations.length;
        long[] dp = new long[n + 1];
        dp[0] = startFuel;
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                if (dp[j] >= stations[i][0]) {
                    dp[j + 1] = Math.max(dp[j + 1], dp[j] + (long) stations[i][1]);
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            if (dp[i] >= target) {
                return i;
            }
        }
        return -1;
    }

}
