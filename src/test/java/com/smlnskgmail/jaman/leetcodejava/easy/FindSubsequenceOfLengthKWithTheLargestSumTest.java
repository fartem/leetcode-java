package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FindSubsequenceOfLengthKWithTheLargestSumTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{3, 3},
                new FindSubsequenceOfLengthKWithTheLargestSum(
                        new int[]{2, 1, 3, 3},
                        2
                ).solution()
        );
    }

}
