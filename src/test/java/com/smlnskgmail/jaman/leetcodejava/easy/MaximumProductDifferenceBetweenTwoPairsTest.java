package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumProductDifferenceBetweenTwoPairsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                34,
                new MaximumProductDifferenceBetweenTwoPairs(new int[] {5, 6, 2, 7, 4}).solution());
    }
}
