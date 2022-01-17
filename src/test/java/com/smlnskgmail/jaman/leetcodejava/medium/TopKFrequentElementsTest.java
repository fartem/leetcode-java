package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TopKFrequentElementsTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[] {2, 1},
                new TopKFrequentElements(new int[] {1, 1, 1, 2, 2, 3}, 2).solution());
    }
}
