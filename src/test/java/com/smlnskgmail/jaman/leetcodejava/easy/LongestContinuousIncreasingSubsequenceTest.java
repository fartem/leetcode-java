package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestContinuousIncreasingSubsequenceTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new LongestContinuousIncreasingSubsequence(
                        new int[]{1, 3, 5, 4, 7}
                ).solution()
        );
    }

}
