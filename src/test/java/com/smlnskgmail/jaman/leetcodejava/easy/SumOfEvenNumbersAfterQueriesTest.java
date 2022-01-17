package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SumOfEvenNumbersAfterQueriesTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[] {8, 6, 2, 4},
                new SumOfEvenNumbersAfterQueries(
                                new int[] {1, 2, 3, 4},
                                new int[][] {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}})
                        .solution());
    }
}
