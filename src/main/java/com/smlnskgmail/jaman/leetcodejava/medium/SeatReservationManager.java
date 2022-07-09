package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

// https://leetcode.com/problems/seat-reservation-manager/
public class SeatReservationManager {

    private final Queue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(a -> a));

    public SeatReservationManager(int n) {
        for (int i = 1; i <= n; i++) {
            heap.add(i);
        }
    }

    public int reserve() {
        return heap.poll();
    }

    public void unreserve(int seatNumber) {
        heap.add(seatNumber);
    }

}
