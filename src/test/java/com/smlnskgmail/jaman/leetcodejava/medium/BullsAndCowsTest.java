package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BullsAndCowsTest {

    @Test
    public void defaultTest() {
        assertEquals("1A3B", new BullsAndCows("1807", "7810").solution());
    }

}
