package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MonotonicArrayTest {

    @Test
    public void defaultTest() {
        assertTrue(new MonotonicArray(new int[] {1, 2, 2, 3}).solution());
    }
}
