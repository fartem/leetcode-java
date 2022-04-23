package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountTripletsThatCanFormTwoArraysOfEqualXORTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new CountTripletsThatCanFormTwoArraysOfEqualXOR(
                        new int[]{2, 3, 1, 6, 7}
                ).solution()
        );
    }

}
