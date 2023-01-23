package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumCommonValueTest {

    @Test
    public void defaultTests() {
        assertEquals(
                2,
                new MinimumCommonValue(
                        new int[]{1, 2, 3},
                        new int[]{2, 4}
                ).solution()
        );
        assertEquals(
                2,
                new MinimumCommonValue(
                        new int[]{1, 2, 3, 6},
                        new int[]{2, 3, 4, 5}
                ).solution()
        );
    }

}
