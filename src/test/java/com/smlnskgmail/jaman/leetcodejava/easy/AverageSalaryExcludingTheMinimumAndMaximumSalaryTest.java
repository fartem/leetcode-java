package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AverageSalaryExcludingTheMinimumAndMaximumSalaryTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2500.00000,
                new AverageSalaryExcludingTheMinimumAndMaximumSalary(
                        new int[]{4000, 3000, 1000, 2000}
                ).solution(),
                0
        );
    }

}
