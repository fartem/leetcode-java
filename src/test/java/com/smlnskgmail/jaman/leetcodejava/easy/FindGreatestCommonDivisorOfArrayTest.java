package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindGreatestCommonDivisorOfArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2, new FindGreatestCommonDivisorOfArray(new int[] {2, 5, 6, 9, 10}).solution());
    }
}
