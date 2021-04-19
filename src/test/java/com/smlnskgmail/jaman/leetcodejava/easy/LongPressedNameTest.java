package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LongPressedNameTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new LongPressedName(
                        "alex",
                        "aaleex"
                ).solution()
        );
    }

}
