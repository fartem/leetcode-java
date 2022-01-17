package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumDifferenceBetweenIncreasingElementsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new MaximumDifferenceBetweenIncreasingElements(new int[] {7, 1, 5, 4}).solution());
    }
}
