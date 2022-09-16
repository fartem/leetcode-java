package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumScoreFromPerformingMultiplicationOperationsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                14,
                new MaximumScoreFromPerformingMultiplicationOperations(
                        new int[]{1, 2, 3},
                        new int[]{3, 2, 1}
                ).solution()
        );
    }

}
