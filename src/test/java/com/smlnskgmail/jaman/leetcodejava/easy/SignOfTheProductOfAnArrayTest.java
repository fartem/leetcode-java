package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SignOfTheProductOfAnArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1, new SignOfTheProductOfAnArray(new int[] {-1, -2, -3, -4, 3, 2, 1}).solution());
    }
}
