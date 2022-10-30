package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FlippingAnImageTest {

    @Test
    public void defaultTest() {
        int[][] correct = new int[][]{{1, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] solution = new FlippingAnImage(
                new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}}
        ).solution();
        for (int i = 0; i < correct.length; i++) {
            assertArrayEquals(correct[i], solution[i]);
        }
    }

}
