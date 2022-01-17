package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberOfStepsToReduceANumberToZeroTest {

    @Test
    public void defaultTest() {
        assertEquals(6, new NumberOfStepsToReduceANumberToZero(14).solution());
    }
}
