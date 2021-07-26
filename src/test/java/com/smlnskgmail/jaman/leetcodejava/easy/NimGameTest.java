package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class NimGameTest {

    @Test
    public void defaultTest() {
        assertFalse(
                new NimGame(4).solution()
        );
    }

}
