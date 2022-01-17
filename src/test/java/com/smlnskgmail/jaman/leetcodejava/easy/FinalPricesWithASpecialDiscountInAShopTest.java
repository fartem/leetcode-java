package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class FinalPricesWithASpecialDiscountInAShopTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[] {4, 2, 4, 2, 3},
                new FinalPricesWithASpecialDiscountInAShop(new int[] {8, 4, 6, 2, 3}).solution());
    }
}
