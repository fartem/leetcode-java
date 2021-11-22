package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumDifferenceBetweenIncreasingElementsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new MaximumDifferenceBetweenIncreasingElements(
                        new int[]{7, 1, 5, 4}
                ).solution()
        );
    }

}
