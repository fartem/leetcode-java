package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestPositiveIntegerThatExistsWithItsNegativeTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new LargestPositiveIntegerThatExistsWithItsNegative(
                        new int[]{-1, 2, -3, 3}
                ).solution()
        );
    }

}
