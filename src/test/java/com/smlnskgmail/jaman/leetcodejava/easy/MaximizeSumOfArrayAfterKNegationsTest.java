package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximizeSumOfArrayAfterKNegationsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                5,
                new MaximizeSumOfArrayAfterKNegations(
                        new int[]{4, 2, 3},
                        1
                ).solution()
        );
    }

}
