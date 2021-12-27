package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RingsAndRodsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new RingsAndRods("B0B6G0R6R0R6G9").solution()
        );
    }

}
