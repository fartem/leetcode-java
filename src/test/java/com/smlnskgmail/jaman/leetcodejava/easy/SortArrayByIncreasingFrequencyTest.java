package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SortArrayByIncreasingFrequencyTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[] {3, 1, 1, 2, 2, 2},
                new SortArrayByIncreasingFrequency(new int[] {1, 1, 2, 2, 2, 3}).solution());
    }
}
