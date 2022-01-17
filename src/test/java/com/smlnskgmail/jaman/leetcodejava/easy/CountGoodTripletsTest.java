package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountGoodTripletsTest {

    @Test
    public void defaultTest() {
        assertEquals(4, new CountGoodTriplets(new int[] {3, 0, 1, 1, 9, 7}, 7, 2, 3).solution());
    }
}
