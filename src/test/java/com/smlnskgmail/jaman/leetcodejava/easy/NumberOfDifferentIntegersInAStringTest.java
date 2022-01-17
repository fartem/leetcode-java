package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberOfDifferentIntegersInAStringTest {

    @Test
    public void defaultTest() {
        assertEquals(3, new NumberOfDifferentIntegersInAString("a123bc34d8ef34").solution());
    }
}
