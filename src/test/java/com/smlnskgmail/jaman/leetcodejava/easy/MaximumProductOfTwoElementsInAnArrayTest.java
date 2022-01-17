package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumProductOfTwoElementsInAnArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                12, new MaximumProductOfTwoElementsInAnArray(new int[] {3, 4, 5, 2}).solution());
    }
}
