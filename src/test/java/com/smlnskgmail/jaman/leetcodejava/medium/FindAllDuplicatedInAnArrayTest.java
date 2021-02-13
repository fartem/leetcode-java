package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FindAllDuplicatedInAnArrayTest {

    @Test
    public void defaultTest() {
        assertEquals(
                Arrays.asList(2, 3),
                new FindAllDuplicatedInAnArray(
                        new int[]{3, 4, 2, 7, 8, 2, 3, 1}
                ).solution()
        );
    }

}
