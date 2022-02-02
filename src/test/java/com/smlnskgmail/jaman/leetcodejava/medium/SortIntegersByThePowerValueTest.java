package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortIntegersByThePowerValueTest {

    @Test
    public void defaultTest() {
        assertEquals(
                13,
                new SortIntegersByThePowerValue(12, 15, 2).solution()
        );
    }

}
