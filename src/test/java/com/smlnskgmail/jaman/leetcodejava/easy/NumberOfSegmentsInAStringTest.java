package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberOfSegmentsInAStringTest {

    @Test
    public void defaultTest() {
        assertEquals(5, new NumberOfSegmentsInAString("Hello, my name is John").solution());
    }
}
