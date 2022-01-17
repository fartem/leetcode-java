package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RichestCustomerWealthTest {

    @Test
    public void defaultTest() {
        assertEquals(6, new RichestCustomerWealth(new int[][] {{1, 2, 3}, {3, 2, 1}}).solution());
    }
}
