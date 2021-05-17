package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class AddToArrayFormOfIntegerTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(1, 2, 3, 4),
                new AddToArrayFormOfInteger(
                        new int[]{1, 2, 0, 0},
                        34
                ).solution()
        );
    }

}
