package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingleNumberTest {

    @Test
    public void defaultTest() {
        assertEquals(1, new SingleNumber(new int[] {2, 2, 1}).solution());
    }
}
