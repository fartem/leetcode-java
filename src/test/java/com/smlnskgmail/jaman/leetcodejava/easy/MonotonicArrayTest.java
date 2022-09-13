package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MonotonicArrayTest {

    @Test
    public void defaultTest() {
        assertTrue(new MonotonicArray(new int[]{1, 2, 2, 3}).solution());
    }

}
