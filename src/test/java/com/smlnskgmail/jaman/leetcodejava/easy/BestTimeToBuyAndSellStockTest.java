package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BestTimeToBuyAndSellStockTest {

    @Test
    public void defaultTest() {
        assertEquals(5, new BestTimeToBuyAndSellStock(new int[] {7, 1, 5, 3, 6, 4}).solution());
    }
}
