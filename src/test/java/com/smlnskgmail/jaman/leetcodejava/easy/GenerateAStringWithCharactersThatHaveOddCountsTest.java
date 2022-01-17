package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GenerateAStringWithCharactersThatHaveOddCountsTest {

    @Test
    public void defaultTest() {
        assertEquals("aaab", new GenerateAStringWithCharactersThatHaveOddCounts(4).solution());
    }
}
