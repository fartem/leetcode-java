package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortArrayByIncreasingFrequencyTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{3, 1, 1, 2, 2, 2},
                new SortArrayByIncreasingFrequency(
                        new int[]{1, 1, 2, 2, 2, 3}
                ).solution()
        );
    }

}
