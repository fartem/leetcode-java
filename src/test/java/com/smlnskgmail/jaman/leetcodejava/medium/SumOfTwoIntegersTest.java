package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfTwoIntegersTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new SumOfTwoIntegers(1, 2).solution()
        );
    }

}
