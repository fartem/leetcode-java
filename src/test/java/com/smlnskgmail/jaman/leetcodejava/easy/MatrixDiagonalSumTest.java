package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MatrixDiagonalSumTest {

    @Test
    public void defaultTest() {
        assertEquals(
                25,
                new MatrixDiagonalSum(
                                new int[][] {
                                    {1, 2, 3},
                                    {4, 5, 6},
                                    {7, 8, 9}
                                })
                        .solution());
    }
}
