package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SpiralMatrixIITest {

    @Test
    public void defaultTest() {
        int[][] correct = new int[][]{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        int[][] solution = new SpiralMatrixII(3).solution();
        assertEquals(correct.length, solution.length);
        assertEquals(correct[0].length, solution[0].length);
        for (int i = 0; i < correct.length; i++) {
            assertArrayEquals(correct[i], solution[i]);
        }
    }

}
