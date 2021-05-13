package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfDifferentIntegersInAStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new NumberOfDifferentIntegersInAString(
                        "a123bc34d8ef34"
                ).solution()
        );
    }

}
