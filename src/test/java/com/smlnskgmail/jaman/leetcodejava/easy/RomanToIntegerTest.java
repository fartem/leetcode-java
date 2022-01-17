package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanToIntegerTest {

    @Test
    public void defaultTest() {
        assertEquals(3, new RomanToInteger("III").solution());
    }
}
