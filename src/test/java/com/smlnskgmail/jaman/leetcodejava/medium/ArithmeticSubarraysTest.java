package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArithmeticSubarraysTest {

    @Test
    public void defaultTest() {
        assertEquals(
                List.of(true, false, true),
                new ArithmeticSubarrays(
                        new int[]{4, 6, 5, 9, 3, 7},
                        new int[]{0, 0, 2},
                        new int[]{2, 3, 5}
                ).solution()
        );
    }

}
