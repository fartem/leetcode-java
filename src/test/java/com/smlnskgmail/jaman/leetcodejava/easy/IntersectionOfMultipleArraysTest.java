package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class IntersectionOfMultipleArraysTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(3, 4),
                new IntersectionOfMultipleArrays(
                        new int[][]{{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}}
                ).solution()
        );
    }

}
