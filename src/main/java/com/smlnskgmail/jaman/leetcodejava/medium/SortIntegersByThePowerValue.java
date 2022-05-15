package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// https://leetcode.com/problems/sort-integers-by-the-power-value
public class SortIntegersByThePowerValue {

    private final int lo;
    private final int hi;
    private final int k;

    public SortIntegersByThePowerValue(int lo, int hi, int k) {
        this.lo = lo;
        this.hi = hi;
        this.k = k;
    }

    public int solution() {
        List<int[]> powers = new ArrayList<>();
        for (int i = lo; i <= hi; i++) {
            int num = i;
            int power = 0;
            while (num != 1) {
                num = num % 2 == 0 ? num / 2 : num * 3 + 1;
                power++;
            }
            powers.add(new int[]{i, power});
        }
        powers.sort(Comparator.comparingInt(o -> o[1]));
        return powers.get(k - 1)[0];
    }

}
