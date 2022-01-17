package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MakeTwoArraysEqualByReversingSubArraysTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new MakeTwoArraysEqualByReversingSubArrays(
                                new int[] {1, 2, 3, 4}, new int[] {2, 4, 1, 3})
                        .solution());
    }
}
