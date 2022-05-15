package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MaximumXORForEachQueryTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{0, 3, 2, 3},
                new MaximumXORForEachQuery(
                        new int[]{0, 1, 1, 3},
                        2
                ).solution()
        );
    }

}
