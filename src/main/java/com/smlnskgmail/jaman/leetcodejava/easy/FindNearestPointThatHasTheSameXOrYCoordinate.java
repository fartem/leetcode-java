package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/
public class FindNearestPointThatHasTheSameXOrYCoordinate {

    private final int x;
    private final int y;
    private final int[][] points;

    public FindNearestPointThatHasTheSameXOrYCoordinate(
            int x,
            int y,
            int[][] points
    ) {
        this.x = x;
        this.y = y;
        this.points = points;
    }

    public int solution() {
        int result = -1;
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            int pX = point[0];
            int pY = point[1];
            if (pX == x || pY == y) {
                int candidate = Math.abs(x - pX) + Math.abs(y - pY);
                if (candidate < distance) {
                    distance = candidate;
                    result = i;
                }
            }
        }
        return result;
    }

}
