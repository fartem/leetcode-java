package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfStepsToReduceANumberToZeroTest {

    @Test
    public void defaultTest() {
        assertEquals(
                6,
                new NumberOfStepsToReduceANumberToZero(14).solution()
        );
    }

}
