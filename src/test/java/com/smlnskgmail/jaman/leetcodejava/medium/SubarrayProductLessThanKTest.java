package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubarrayProductLessThanKTest {

    @Test
    public void defaultTest() {
        assertEquals(
                8,
                new SubarrayProductLessThanK(
                        new int[]{10, 5, 2, 6},
                        100
                ).solution()
        );
    }

}
