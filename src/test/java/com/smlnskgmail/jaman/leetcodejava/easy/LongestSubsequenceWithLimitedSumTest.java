package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class LongestSubsequenceWithLimitedSumTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{2, 3, 4},
                new LongestSubsequenceWithLimitedSum(
                        new int[]{4, 5, 2, 1},
                        new int[]{3, 10, 21}
                ).solution()
        );
    }

}
