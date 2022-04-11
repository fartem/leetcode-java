package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountNicePairsInAnArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new CountNicePairsInAnArray(new int[]{42, 11, 1, 97}).solution()
        );
    }

}
