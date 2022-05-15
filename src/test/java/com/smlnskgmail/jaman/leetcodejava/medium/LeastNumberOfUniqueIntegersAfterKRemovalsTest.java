package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeastNumberOfUniqueIntegersAfterKRemovalsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new LeastNumberOfUniqueIntegersAfterKRemovals(
                        new int[]{5, 5, 4},
                        1
                ).solution()
        );
    }

}
