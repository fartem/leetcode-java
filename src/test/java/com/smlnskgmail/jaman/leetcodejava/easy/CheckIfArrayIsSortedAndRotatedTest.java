package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckIfArrayIsSortedAndRotatedTest {

    @Test
    public void defaultTest() {
        assertTrue(new CheckIfArrayIsSortedAndRotated(new int[] {3, 4, 5, 1, 2}).solution());
    }
}
