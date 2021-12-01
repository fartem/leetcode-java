package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SlowestKeyTest {

    @Test
    public void defaultTest() {
        assertEquals(
                'c',
                new SlowestKey(
                        new int[]{9, 29, 49, 50},
                        "cbcd"
                ).solution()
        );
        assertEquals(
                'a',
                new SlowestKey(
                        new int[]{12, 23, 36, 46, 62},
                        "spuda"
                ).solution()
        );
    }

}
