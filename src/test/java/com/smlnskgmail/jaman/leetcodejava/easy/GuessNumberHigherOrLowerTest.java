package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GuessNumberHigherOrLowerTest {

    @Test
    public void defaultTest() {
        assertEquals(6, new GuessNumberHigherOrLower(10, 6).solution());
    }
}
