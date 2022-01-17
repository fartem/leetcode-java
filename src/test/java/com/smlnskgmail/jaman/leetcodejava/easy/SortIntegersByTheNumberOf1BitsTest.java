package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SortIntegersByTheNumberOf1BitsTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[] {0, 1, 2, 4, 8, 3, 5, 6, 7},
                new SortIntegersByTheNumberOf1Bits(new int[] {0, 1, 2, 4, 8, 3, 5, 6, 7})
                        .solution());
    }
}
