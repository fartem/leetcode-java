package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TwoSumTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(new int[] {0, 1}, new TwoSum(new int[] {2, 7, 11, 15}, 9).solution());
    }
}
