package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfRectanglesThatCanFormTheLargestSquareTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new NumberOfRectanglesThatCanFormTheLargestSquare(
                        new int[][]{{5, 8}, {3, 9}, {5, 12}, {16, 5}}
                ).solution()
        );
    }

}
