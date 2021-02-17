package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountNegativeNumbersInASortedMatrixTest {

    @Test
    public void defaultTest() {
        assertEquals(
                8,
                new CountNegativeNumbersInASortedMatrix(
                        new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}}
                ).solution()
        );
    }

}
