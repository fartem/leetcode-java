package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestIncreasingSubsequenceTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new LongestIncreasingSubsequence(
                        new int[]{10, 9, 2, 5, 3, 7, 101, 18}
                ).solution()
        );
    }

}
