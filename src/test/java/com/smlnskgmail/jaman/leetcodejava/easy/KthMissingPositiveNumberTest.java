package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KthMissingPositiveNumberTest {

    @Test
    public void defaultTest() {
        assertEquals(9, new KthMissingPositiveNumber(new int[] {2, 3, 4, 7, 11}, 5).solution());
    }
}
