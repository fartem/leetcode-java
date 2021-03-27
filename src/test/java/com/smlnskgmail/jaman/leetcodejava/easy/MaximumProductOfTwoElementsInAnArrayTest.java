package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumProductOfTwoElementsInAnArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                12,
                new MaximumProductOfTwoElementsInAnArray(
                        new int[]{3, 4, 5, 2}
                ).solution()
        );
    }

}
