package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestIndexWithEqualValueTest {

    @Test
    public void defaultTest() {
        assertEquals(
                0,
                new SmallestIndexWithEqualValue(
                        new int[]{0, 1, 2}
                ).solution()
        );
    }

}
