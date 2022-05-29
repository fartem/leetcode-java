package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringToIntegerAtoiTest {

    @Test
    public void defaultTest() {
        assertEquals(
                42,
                new StringToIntegerAtoi("42").solution()
        );
    }

}
