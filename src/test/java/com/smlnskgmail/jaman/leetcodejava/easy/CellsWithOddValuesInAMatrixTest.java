package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CellsWithOddValuesInAMatrixTest {

    @Test
    public void defaultTest() {
        assertEquals(
                6, new CellsWithOddValuesInAMatrix(2, 3, new int[][] {{0, 1}, {1, 1}}).solution());
    }
}
