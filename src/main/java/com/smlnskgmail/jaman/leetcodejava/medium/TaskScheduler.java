package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/task-scheduler/
public class TaskScheduler {

    private final char[] tasks;
    private final int n;

    public TaskScheduler(char[] tasks, int n) {
        this.tasks = tasks;
        this.n = n;
    }

    public int solution() {
        int[] count = new int[26];
        int max = 0;
        int maxCount = 0;
        for (char task : tasks) {
            int i = task - 'A';
            count[i]++;
            int c = count[i];
            if (c == max) {
                maxCount++;
            } else if (c > max) {
                max = c;
                maxCount = 1;
            }
        }
        return Math.max(tasks.length, (max - 1) * (n + 1) + maxCount);
    }

}
