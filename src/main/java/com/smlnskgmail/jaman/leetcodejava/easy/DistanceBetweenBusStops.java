package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/distance-between-bus-stops/
public class DistanceBetweenBusStops {

    private final int[] distance;
    private final int start;
    private final int destination;

    public DistanceBetweenBusStops(int[] distance, int start, int destination) {
        this.distance = distance;
        this.start = start;
        this.destination = destination;
    }

    public int solution() {
        int sum = 0;
        for (int dist : distance) {
            sum += dist;
        }
        int min = Math.min(start, destination);
        int max = Math.max(start, destination);
        int clockWise = 0;
        for (int i = min; i < max; i++) {
            clockWise += distance[i];
        }
        return Math.min(clockWise, sum - clockWise);
    }

}
