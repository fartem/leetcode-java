package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FindAllLonelyNumbersInTheArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(10, 8),
                new FindAllLonelyNumbersInTheArray(
                        new int[]{10, 6, 5, 8}
                ).solution()
        );
    }

}
