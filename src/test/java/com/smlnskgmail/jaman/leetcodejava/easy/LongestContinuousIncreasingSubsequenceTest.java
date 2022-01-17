package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestContinuousIncreasingSubsequenceTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new LongestContinuousIncreasingSubsequence(new int[] {1, 3, 5, 4, 7}).solution());
    }
}
