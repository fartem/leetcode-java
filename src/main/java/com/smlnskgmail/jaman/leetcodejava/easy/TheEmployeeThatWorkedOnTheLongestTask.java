package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/the-employee-that-worked-on-the-longest-task/
public class TheEmployeeThatWorkedOnTheLongestTask {

    private final int n;
    private final int[][] logs;

    public TheEmployeeThatWorkedOnTheLongestTask(int n, int[][] logs) {
        this.n = n;
        this.logs = logs;
    }

    public int solution() {
        int max = logs[0][1];
        int result = logs[0][0];
        for (int i = 1; i < logs.length; i++) {
            int time = logs[i][1] - logs[i - 1][1];
            if (time > max || (time == max && result > logs[i][0])) {
                max = time;
                result = logs[i][0];
            }
        }
        return result;
    }

}
