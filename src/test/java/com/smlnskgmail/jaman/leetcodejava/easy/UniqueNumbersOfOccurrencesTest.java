package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UniqueNumbersOfOccurrencesTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new UniqueNumbersOfOccurrences(
                        new int[]{1, 2, 2, 1, 1, 3}
                ).solution()
        );
    }

}
