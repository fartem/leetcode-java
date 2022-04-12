package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumProductAfterKIncrementsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                20,
                new MaximumProductAfterKIncrements(
                        new int[]{24, 5, 64, 53, 26, 38},
                        54
                ).solution()
        );
    }

}
