package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeNumberOfSetBitsInBinaryRepresentationTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new PrimeNumberOfSetBitsInBinaryRepresentation(
                        6,
                        10
                ).solution()
        );
    }

}
