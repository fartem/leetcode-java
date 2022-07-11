package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FloodFillTest {

    @Test
    public void defaultTest() {
        int[][] correct = new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};
        int[][] solution = new FloodFill(
                new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}},
                1,
                1,
                2
        ).solution();
        assertEquals(correct.length, solution.length);
        for (int i = 0; i < correct.length; i++) {
            assertArrayEquals(correct[i], solution[i]);
        }
    }

}
