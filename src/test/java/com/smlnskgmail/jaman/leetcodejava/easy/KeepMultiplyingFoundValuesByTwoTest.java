package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeepMultiplyingFoundValuesByTwoTest {

    @Test
    public void defaultTest() {
        assertEquals(
                24,
                new KeepMultiplyingFoundValuesByTwo(
                        new int[]{5, 3, 6, 1, 12},
                        3
                ).solution()
        );
    }

}
