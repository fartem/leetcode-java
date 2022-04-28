package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountNumberOfNiceSubarraysTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new CountNumberOfNiceSubarrays(
                        new int[]{1, 1, 2, 1, 1},
                        3
                ).solution()
        );
    }

}
