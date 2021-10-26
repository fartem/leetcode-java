package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessNumberHigherOrLowerTest {

    @Test
    public void defaultTest() {
        assertEquals(
                6,
                new GuessNumberHigherOrLower(
                        10,
                        6
                ).solution()
        );
    }

}
