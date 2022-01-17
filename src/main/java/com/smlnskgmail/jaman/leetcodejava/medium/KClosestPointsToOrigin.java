package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Arrays;
import java.util.Comparator;

// https://leetcode.com/problems/k-closest-points-to-origin
public class KClosestPointsToOrigin {

    private final int[][] points;
    private final int k;

    public KClosestPointsToOrigin(int[][] points, int k) {
        this.points = points;
        this.k = k;
    }

    public int[][] solution() {
        Arrays.sort(points, Comparator.comparingInt(this::distance));
        int[][] result = new int[k][2];
        System.arraycopy(points, 0, result, 0, k);
        return result;
    }

    private int distance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
