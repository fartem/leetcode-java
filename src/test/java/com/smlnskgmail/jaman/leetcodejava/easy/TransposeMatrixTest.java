package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TransposeMatrixTest {

    @Test
    public void defaultTest() {
        int[][] correct = new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        int[][] solution = new TransposeMatrix(
                new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
        ).solution();
        assertEquals(correct.length, solution.length);
        for (int i = 0; i < correct.length; i++) {
            assertArrayEquals(correct[i], solution[i]);
        }
    }

}
