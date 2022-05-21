package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/
public class MinimumNumberOfMovesToSeatEveryone {

    private final int[] seats;
    private final int[] students;

    public MinimumNumberOfMovesToSeatEveryone(int[] seats, int[] students) {
        this.seats = seats;
        this.students = students;
    }

    public int solution() {
        Arrays.sort(seats);
        Arrays.sort(students);
        int result = 0;
        for (int i = 0; i < seats.length; i++) {
            result += Math.abs(seats[i] - students[i]);
        }
        return result;
    }

}
