package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfAllOddLengthSubarraysTest {

    @Test
    public void defaultTest() {
        assertEquals(
                58,
                new SumOfAllOddLengthSubarrays(
                        new int[]{1, 4, 2, 5, 3}
                ).solution()
        );
    }

}
