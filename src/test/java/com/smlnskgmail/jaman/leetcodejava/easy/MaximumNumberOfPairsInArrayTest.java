package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MaximumNumberOfPairsInArrayTest {

    @Test
    public void defaultTests() {
        assertArrayEquals(
                new int[]{3, 1},
                new MaximumNumberOfPairsInArray(
                        new int[]{1, 3, 2, 1, 3, 2, 2}
                ).solution()
        );
        assertArrayEquals(
                new int[]{1, 0},
                new MaximumNumberOfPairsInArray(new int[]{1, 1}).solution()
        );
        assertArrayEquals(
                new int[]{0, 1},
                new MaximumNumberOfPairsInArray(new int[]{0}).solution()
        );
    }

}
