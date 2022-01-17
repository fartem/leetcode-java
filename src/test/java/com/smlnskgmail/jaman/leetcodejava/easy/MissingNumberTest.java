package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MissingNumberTest {

    @Test
    public void defaultTest() {
        assertEquals(2, new MissingNumber(new int[] {3, 0, 1}).solution());
    }
}
