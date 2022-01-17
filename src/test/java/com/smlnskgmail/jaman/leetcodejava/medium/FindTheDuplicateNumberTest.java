package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindTheDuplicateNumberTest {

    @Test
    public void defaultTest() {
        assertEquals(2, new FindTheDuplicateNumber(new int[] {1, 3, 4, 2, 2}).solution());
    }
}
