package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SpiralMatrixTest {

    @Test
    public void defaultTest() {
        assertEquals(
                List.of(1, 2, 3, 6, 9, 8, 7, 4, 5),
                new SpiralMatrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}).solution()
        );
    }

}
