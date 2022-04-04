package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ProductOfArrayExceptSelfTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{24, 12, 8, 6},
                new ProductOfArrayExceptSelf(new int[]{1, 2, 3, 4}).solution()
        );
        assertArrayEquals(
                new int[]{0, 0, 9, 0, 0},
                new ProductOfArrayExceptSelf(new int[]{-1, 1, 0, -3, 3}).solution()
        );
    }

}
