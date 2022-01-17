package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/time-needed-to-buy-tickets
public class TimeNeededToBuyTickets {

    private final int[] tickets;
    private final int k;

    public TimeNeededToBuyTickets(int[] tickets, int k) {
        this.tickets = tickets;
        this.k = k;
    }

    public int solution() {
        int result = 0;
        for (int i = 0; i < tickets.length; i++) {
            int n = tickets[k];
            int c = tickets[i];
            if (i <= k) {
                result += Math.min(n, c);
            } else {
                result += Math.min(n - 1, c);
            }
        }
        return result;
    }
}
