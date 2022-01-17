package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximizeSumOfArrayAfterKNegationsTest {

    @Test
    public void defaultTest() {
        assertEquals(5, new MaximizeSumOfArrayAfterKNegations(new int[] {4, 2, 3}, 1).solution());
    }
}
