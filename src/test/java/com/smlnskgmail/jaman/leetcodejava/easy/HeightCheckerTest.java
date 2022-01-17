package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HeightCheckerTest {

    @Test
    public void defaultTest() {
        assertEquals(3, new HeightChecker(new int[] {1, 1, 4, 2, 1, 3}).solution());
    }
}
