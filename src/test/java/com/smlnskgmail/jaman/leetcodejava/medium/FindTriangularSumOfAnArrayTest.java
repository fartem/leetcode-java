package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTriangularSumOfAnArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                8,
                new FindTriangularSumOfAnArray(
                        new int[]{1, 2, 3, 4, 5}
                ).solution()
        );
    }

}
