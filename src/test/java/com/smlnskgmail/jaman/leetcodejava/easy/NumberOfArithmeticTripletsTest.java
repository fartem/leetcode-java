package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfArithmeticTripletsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new NumberOfArithmeticTriplets(
                        new int[]{0, 1, 4, 6, 7, 10},
                        3
                ).solution()
        );
    }

}
