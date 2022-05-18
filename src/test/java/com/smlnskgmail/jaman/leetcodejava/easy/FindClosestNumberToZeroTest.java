package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindClosestNumberToZeroTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new FindClosestNumberToZero(new int[]{-4, -2, 1, 4, 8}).solution()
        );
    }

}
