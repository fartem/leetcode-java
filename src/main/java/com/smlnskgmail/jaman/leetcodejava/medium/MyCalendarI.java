package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.List;

public class MyCalendarI {

    private final List<int[]> calendar = new ArrayList<>();

    public boolean book(int start, int end) {
        for (int[] iv : calendar) {
            if (iv[0] < end && iv[1] > start) {
                return false;
            }
        }
        calendar.add(new int[]{start, end});
        return true;
    }

}
