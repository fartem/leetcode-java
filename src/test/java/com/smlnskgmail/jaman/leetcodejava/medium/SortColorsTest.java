package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortColorsTest {

    @Test
    public void defaultTest() {
        int[] solution = new int[]{2, 0, 2, 1, 1, 0};
        new SortColors(solution).solution();
        assertArrayEquals(
                new int[]{0, 0, 1, 1, 2, 2},
                solution
        );
    }

}
