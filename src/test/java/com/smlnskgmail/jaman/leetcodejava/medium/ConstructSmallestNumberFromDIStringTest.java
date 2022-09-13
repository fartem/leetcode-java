package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructSmallestNumberFromDIStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "123549876",
                new ConstructSmallestNumberFromDIString(
                        "IIIDIDDD"
                ).solution()
        );
    }

}
