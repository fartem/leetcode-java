package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class IntervalsBetweenIdenticalElementsTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new long[]{4, 2, 7, 2, 4, 4, 5},
                new IntervalsBetweenIdenticalElements(
                        new int[]{2, 1, 3, 1, 2, 3, 3}
                ).solution()
        );
    }

}
