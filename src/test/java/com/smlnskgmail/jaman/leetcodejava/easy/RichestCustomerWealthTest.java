package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RichestCustomerWealthTest {

    @Test
    public void defaultTest() {
        assertEquals(
                6,
                new RichestCustomerWealth(
                        new int[][]{{1, 2, 3}, {3, 2, 1}}
                ).solution()
        );
    }

}
