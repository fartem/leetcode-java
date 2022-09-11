package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UniqueNumberOfOccurrencesTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new UniqueNumberOfOccurrences(
                        new int[]{1, 2, 2, 1, 1, 3}
                ).solution()
        );
    }

}
