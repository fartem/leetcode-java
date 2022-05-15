package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

// https://leetcode.com/problems/single-threaded-cpu
public class SingleThreadedCPU {

    private final int[][] input;

    public SingleThreadedCPU(int[][] input) {
        this.input = input;
    }

    public int[] solution() {
        int[][] orders = new int[input.length][3];
        for (int i = 0; i < input.length; i++) {
            int[] task = input[i];
            orders[i] = new int[]{i, task[0], task[1]};
        }
        Arrays.sort(orders, Comparator.comparingInt(a -> a[1]));
        PriorityQueue<int[]> pTasks = new PriorityQueue<>((a, b) -> a[2] == b[2] ? a[0] - b[0] : a[2] - b[2]);
        int[] result = new int[orders.length];
        int time = 0;
        int count = 0;
        int curr = 0;
        while (count < orders.length) {
            if (pTasks.isEmpty()) {
                time = Math.max(time, orders[curr][1]);
            }
            while (curr < orders.length && time >= orders[curr][1]) {
                pTasks.offer(orders[curr++]);
            }
            int[] active = pTasks.poll();
            result[count++] = active[0];
            time += active[2];
        }
        return result;
    }

}
