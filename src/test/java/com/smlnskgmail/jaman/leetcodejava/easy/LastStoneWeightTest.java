package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LastStoneWeightTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new LastStoneWeight(
                        new int[]{2, 7, 4, 1, 8, 1}
                ).solution()
        );
    }

}
