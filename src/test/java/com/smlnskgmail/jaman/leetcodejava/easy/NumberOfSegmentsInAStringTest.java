package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfSegmentsInAStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                5,
                new NumberOfSegmentsInAString(
                        "Hello, my name is John"
                ).solution()
        );
    }

}
