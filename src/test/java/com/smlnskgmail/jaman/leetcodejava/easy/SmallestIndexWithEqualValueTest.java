package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SmallestIndexWithEqualValueTest {

    @Test
    public void defaultTest() {
        assertEquals(0, new SmallestIndexWithEqualValue(new int[] {0, 1, 2}).solution());
    }
}
