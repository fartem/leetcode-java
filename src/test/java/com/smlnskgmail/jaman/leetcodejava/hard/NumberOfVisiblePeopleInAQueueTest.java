package com.smlnskgmail.jaman.leetcodejava.hard;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NumberOfVisiblePeopleInAQueueTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{3, 1, 2, 1, 1, 0},
                new NumberOfVisiblePeopleInAQueue(
                        new int[]{10, 6, 8, 5, 11, 9}
                ).solution()
        );
    }

}
