package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LastStoneWeightTest {

    @Test
    public void defaultTest() {
        assertEquals(1, new LastStoneWeight(new int[] {2, 7, 4, 1, 8, 1}).solution());
    }
}
