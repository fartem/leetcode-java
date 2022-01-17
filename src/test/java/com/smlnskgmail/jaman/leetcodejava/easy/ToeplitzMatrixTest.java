package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ToeplitzMatrixTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new ToeplitzMatrix(
                                new int[][] {
                                    {1, 2, 3, 4},
                                    {5, 1, 2, 3},
                                    {9, 5, 1, 2}
                                })
                        .solution());
    }
}
