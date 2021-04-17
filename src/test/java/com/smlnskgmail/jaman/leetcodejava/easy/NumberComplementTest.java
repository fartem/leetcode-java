package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberComplementTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new NumberComplement(
                        5
                ).solution()
        );
    }

}
