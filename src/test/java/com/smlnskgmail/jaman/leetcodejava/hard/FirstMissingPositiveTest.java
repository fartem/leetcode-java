package com.smlnskgmail.jaman.leetcodejava.hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstMissingPositiveTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new FirstMissingPositive(new int[]{1, 2, 0}).solution()
        );
    }

}
