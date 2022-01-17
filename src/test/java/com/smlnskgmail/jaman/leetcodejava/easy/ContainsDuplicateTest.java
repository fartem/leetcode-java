package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ContainsDuplicateTest {

    @Test
    public void defaultTest() {
        assertTrue(new ContainsDuplicate(new int[] {1, 2, 3, 1}).solution());
    }
}
