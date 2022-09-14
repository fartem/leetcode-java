package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class KClosestPointsToOriginTest {

    @Test
    public void defaultTest() {
        int[][] correct = new int[][]{{2, 2}};
        int[][] solution = new KClosestPointsToOrigin(
                new int[][]{{1, 3}, {2, 2}},
                1
        ).solution();
        for (int i = 0; i < correct.length; i++) {
            assertArrayEquals(correct[i], solution[i]);
        }
    }

}
