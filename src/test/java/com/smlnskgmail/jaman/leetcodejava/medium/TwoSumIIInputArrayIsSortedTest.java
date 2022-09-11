package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumIIInputArrayIsSortedTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{1, 2},
                new TwoSumIIInputArrayIsSorted(
                        new int[]{2, 7, 11, 15},
                        9
                ).solution()
        );
    }

}
