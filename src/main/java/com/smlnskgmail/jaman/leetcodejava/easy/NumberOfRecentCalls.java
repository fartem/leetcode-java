package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.LinkedList;

// https://leetcode.com/problems/number-of-recent-calls
public class NumberOfRecentCalls {

    private final LinkedList<Integer> requests = new LinkedList<>();

    public int ping(int t) {
        requests.addLast(t);
        while (requests.getFirst() < t - 3000) {
            requests.removeFirst();
        }
        return requests.size();
    }

}
