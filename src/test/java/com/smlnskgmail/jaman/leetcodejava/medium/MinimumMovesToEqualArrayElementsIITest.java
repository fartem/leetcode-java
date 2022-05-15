package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumMovesToEqualArrayElementsIITest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new MinimumMovesToEqualArrayElementsII(
                        new int[]{1, 2, 3}
                ).solution()
        );
    }

}
