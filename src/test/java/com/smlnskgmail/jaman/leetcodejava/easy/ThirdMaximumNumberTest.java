package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ThirdMaximumNumberTest {

    @Test
    public void defaultTest() {
        assertEquals(1, new ThirdMaximumNumber(new int[] {3, 2, 1}).solution());
    }
}
