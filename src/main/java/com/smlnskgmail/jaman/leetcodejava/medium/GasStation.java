package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/gas-station/
public class GasStation {

    private final int[] gas;
    private final int[] cost;

    public GasStation(int[] gas, int[] cost) {
        this.gas = gas;
        this.cost = cost;
    }

    public int solution() {
        int tmpSum = 0;
        int index = 0;
        int sum = gas[0] - cost[0];
        for (int i = 1; i < gas.length; i++) {
            if (sum < 0) {
                index = i;
                tmpSum += sum;
                sum = 0;
            }
            sum += gas[i] - cost[i];
        }
        sum += tmpSum;
        return sum >= 0 ? index : -1;
    }

}
