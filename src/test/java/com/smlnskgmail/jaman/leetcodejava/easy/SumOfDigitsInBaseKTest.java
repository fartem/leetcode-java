package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfDigitsInBaseKTest {

    @Test
    public void defaultTest() {
        assertEquals(
                9,
                new SumOfDigitsInBaseK(
                        34,
                        6
                ).solution()
        );
    }

}
