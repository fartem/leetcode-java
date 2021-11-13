package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheDistanceValueBetweenTwoArraysTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new FindTheDistanceValueBetweenTwoArrays(
                        new int[]{4, 5, 8},
                        new int[]{10, 9, 1, 8},
                        2
                ).solution()
        );
    }

}
