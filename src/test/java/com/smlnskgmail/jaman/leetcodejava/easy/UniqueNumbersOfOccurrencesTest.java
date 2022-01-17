package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UniqueNumbersOfOccurrencesTest {

    @Test
    public void defaultTest() {
        assertTrue(new UniqueNumbersOfOccurrences(new int[] {1, 2, 2, 1, 1, 3}).solution());
    }
}
