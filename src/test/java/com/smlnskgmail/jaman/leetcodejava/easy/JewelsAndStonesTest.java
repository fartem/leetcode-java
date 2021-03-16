package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JewelsAndStonesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new JewelsAndStones(
                        "aA",
                        "aAAbbbb"
                ).solution()
        );
    }

}
