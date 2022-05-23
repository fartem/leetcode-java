package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OnesAndZeroesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new OnesAndZeroes(
                        new String[]{"10", "0001", "111001", "1", "0"},
                        5,
                        3
                ).solution()
        );
    }

}
