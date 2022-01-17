package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumOfUniqueNumbersTest {

    @Test
    public void defaultTest() {
        assertEquals(4, new SumOfUniqueNumbers(new int[] {1, 2, 3, 2}).solution());
    }
}
