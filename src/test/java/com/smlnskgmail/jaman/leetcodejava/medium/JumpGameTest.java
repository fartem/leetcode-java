package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class JumpGameTest {

    @Test
    public void defaultTest() {
        assertTrue(new JumpGame(new int[]{2, 3, 1, 1, 4}).solution());
    }

}
