package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateAmountPaidInTaxesTest {

    @Test
    public void defaultTests() {
        assertEquals(
                2.65000,
                new CalculateAmountPaidInTaxes(
                        new int[][]{{3, 50}, {7, 10}, {12, 25}},
                        10
                ).solution(),
                0
        );
        assertEquals(
                0.25000,
                new CalculateAmountPaidInTaxes(
                        new int[][]{{1, 0}, {4, 25}, {5, 50}},
                        2
                ).solution(),
                0
        );
        assertEquals(
                0.00000,
                new CalculateAmountPaidInTaxes(
                        new int[][]{{2, 50}},
                        0
                ).solution(),
                0
        );
    }

}
