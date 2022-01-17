package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseIntegerTest {

    @Test
    public void defaultTest() {
        assertEquals(123, new ReverseInteger(321).solution());
    }
}
