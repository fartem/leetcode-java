package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountOddNumbersInAnIntervalRangeTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new CountOddNumbersInAnIntervalRange(
                        3,
                        7
                ).solution()
        );
    }

}
