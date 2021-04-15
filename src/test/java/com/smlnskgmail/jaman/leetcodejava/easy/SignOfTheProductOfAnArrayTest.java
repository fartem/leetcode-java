package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SignOfTheProductOfAnArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new SignOfTheProductOfAnArray(
                        new int[]{-1, -2, -3, -4, 3, 2, 1}
                ).solution()
        );
    }

}
