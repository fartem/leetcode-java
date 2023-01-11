package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivideTwoIntegersTest {

    @Test
    public void defaultTests() {
        assertEquals(3, new DivideTwoIntegers(10, 3).solution());
        assertEquals(-2, new DivideTwoIntegers(7, -3).solution());
    }

}
