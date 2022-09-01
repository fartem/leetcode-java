package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class LargestLocalValuesInAMatrixTest {

    @Test
    public void defaultTest() {
        int[][] correct = new int[][]{{9, 9}, {8, 6}};
        int[][] solution = new LargestLocalValuesInAMatrix(
                new int[][]{{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}}
        ).solution();
        assertEquals(correct.length, solution.length);
        assertEquals(correct[0].length, solution[0].length);
        for (int i = 0; i < correct.length; i++) {
            assertArrayEquals(correct[i], solution[i]);
        }
    }

}
