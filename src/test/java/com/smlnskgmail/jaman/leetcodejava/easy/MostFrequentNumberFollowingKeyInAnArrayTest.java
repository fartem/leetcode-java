package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MostFrequentNumberFollowingKeyInAnArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                100,
                new MostFrequentNumberFollowingKeyInAnArray(
                        new int[]{1, 100, 200, 1, 100},
                        1
                ).solution()
        );
    }

}
