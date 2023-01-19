package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/determine-if-two-events-have-conflict/
public class DetermineIfTwoEventsHaveConflict {

    private final String[] event1;
    private final String[] event2;

    public DetermineIfTwoEventsHaveConflict(
            String[] event1,
            String[] event2
    ) {
        this.event1 = event1;
        this.event2 = event2;
    }

    public boolean solution() {
        return event1[0].compareTo(event2[1]) <= 0
                && event2[0].compareTo(event1[1]) <= 0;
    }

}
