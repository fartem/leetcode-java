package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountHillsAndValleysInAnArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new CountHillsAndValleysInAnArray(
                        new int[]{2, 4, 1, 1, 6, 5}
                ).solution()
        );
    }

}
