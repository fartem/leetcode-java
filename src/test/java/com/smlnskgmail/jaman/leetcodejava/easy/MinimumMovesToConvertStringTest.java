package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumMovesToConvertStringTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new MinimumMovesToConvertString("XXX").solution()
        );
    }

}
