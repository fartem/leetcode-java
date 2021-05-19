package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortAnArrayTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{1, 2, 3, 5},
                new SortAnArray(
                        new int[]{5, 2, 3, 1}
                ).solution()
        );
    }

}
