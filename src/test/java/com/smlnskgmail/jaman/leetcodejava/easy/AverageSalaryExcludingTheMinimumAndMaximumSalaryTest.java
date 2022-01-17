package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AverageSalaryExcludingTheMinimumAndMaximumSalaryTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2500.00000,
                new AverageSalaryExcludingTheMinimumAndMaximumSalary(
                                new int[] {4000, 3000, 1000, 2000})
                        .solution(),
                0);
    }
}
