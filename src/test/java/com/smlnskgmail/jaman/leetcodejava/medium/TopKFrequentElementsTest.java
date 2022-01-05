package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TopKFrequentElementsTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{2, 1},
                new TopKFrequentElements(
                        new int[]{1, 1, 1, 2, 2, 3},
                        2
                ).solution()
        );
    }

}
