package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class NimGameTest {

    @Test
    public void defaultTest() {
        assertFalse(new NimGame(4).solution());
    }
}
