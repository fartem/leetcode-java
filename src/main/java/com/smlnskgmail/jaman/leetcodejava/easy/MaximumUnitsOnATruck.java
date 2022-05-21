package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;
import java.util.Comparator;

// https://leetcode.com/problems/maximum-units-on-a-truck/
public class MaximumUnitsOnATruck {

    private final int[][] boxTypes;
    private int truckSize;

    public MaximumUnitsOnATruck(int[][] boxTypes, int truckSize) {
        this.boxTypes = boxTypes;
        this.truckSize = truckSize;
    }

    public int solution() {
        Arrays.sort(boxTypes, Comparator.comparingInt(o -> -o[1]));
        int result = 0;
        int p = 0;
        while (truckSize > 0 && p < boxTypes.length) {
            int count = boxTypes[p][0];
            int boxes = boxTypes[p][1];
            if (truckSize >= count) {
                result += count * boxes;
                truckSize -= count;
            } else {
                result += truckSize * boxes;
                truckSize = 0;
            }
            p++;
        }
        return result;
    }

}
