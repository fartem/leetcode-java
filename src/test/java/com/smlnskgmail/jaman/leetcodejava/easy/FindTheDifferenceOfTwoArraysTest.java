package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindTheDifferenceOfTwoArraysTest {

    @Test
    public void defaultTest() {
        assertEquals(
                List.of(Arrays.asList(1, 3), Arrays.asList(4, 6)),
                new FindTheDifferenceOfTwoArrays(
                        new int[]{1, 2, 3},
                        new int[]{2, 4, 6}
                ).solution()
        );
    }

}
