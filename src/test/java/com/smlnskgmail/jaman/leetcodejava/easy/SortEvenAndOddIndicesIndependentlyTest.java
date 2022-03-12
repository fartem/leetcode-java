package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortEvenAndOddIndicesIndependentlyTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{2, 3, 4, 1},
                new SortEvenAndOddIndicesIndependently(
                        new int[]{4, 1, 2, 3}
                ).solution()
        );
    }

}
