package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SpiralMatrixIVTest {

    @Test
    public void defaultTest() {
        int[][] correct = new int[][]{{3, 0, 2, 6, 8}, {5, 0, -1, -1, 1}, {5, 2, 4, 9, 7}};
        int[][] solution = new SpiralMatrixIV(
                3,
                5,
                ListNode.fromNumbers(3, 0, 2, 6, 8, 1, 7, 9, 4, 2, 5, 5, 0)
        ).solution();
        assertEquals(correct.length, solution.length);
        for (int i = 0; i < correct.length; i++) {
            assertArrayEquals(correct[i], solution[i]);
        }
    }

}
