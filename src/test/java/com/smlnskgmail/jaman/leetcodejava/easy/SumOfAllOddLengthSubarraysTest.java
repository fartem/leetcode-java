package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumOfAllOddLengthSubarraysTest {

    @Test
    public void defaultTest() {
        assertEquals(58, new SumOfAllOddLengthSubarrays(new int[] {1, 4, 2, 5, 3}).solution());
    }
}
