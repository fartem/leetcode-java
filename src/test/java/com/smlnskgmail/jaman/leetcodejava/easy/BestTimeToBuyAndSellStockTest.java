package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStockTest {

    @Test
    public void defaultTest() {
        assertEquals(
                5,
                new BestTimeToBuyAndSellStock(
                        new int[]{7, 1, 5, 3, 6, 4}
                ).solution()
        );
    }

}
