package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestHarmoniousSubsequenceTest {

    @Test
    public void defaultTest() {
        assertEquals(
                5, new LongestHarmoniousSubsequence(new int[] {1, 3, 2, 2, 5, 2, 3, 7}).solution());
    }
}
