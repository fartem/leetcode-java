package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LemonadeChangeTest {

    @Test
    public void defaultTest() {
        assertTrue(new LemonadeChange(new int[]{5, 5, 5, 10, 20}).solution());
    }

}
