package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindThePivotIntegerTest {

    @Test
    public void defaultTests() {
        assertEquals(8, new FindThePivotInteger(6).solution());
        assertEquals(1, new FindThePivotInteger(1).solution());
        assertEquals(-1, new FindThePivotInteger(4).solution());
    }

}
