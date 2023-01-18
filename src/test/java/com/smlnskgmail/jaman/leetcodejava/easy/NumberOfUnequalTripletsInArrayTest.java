package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfUnequalTripletsInArrayTest {

    @Test
    public void defaultTests() {
        assertEquals(
                3,
                new NumberOfUnequalTripletsInArray(
                        new int[]{4, 4, 2, 4, 3}
                ).solution()
        );
        assertEquals(
                0,
                new NumberOfUnequalTripletsInArray(
                        new int[]{1, 1, 1, 1, 1}
                ).solution()
        );
    }

}
