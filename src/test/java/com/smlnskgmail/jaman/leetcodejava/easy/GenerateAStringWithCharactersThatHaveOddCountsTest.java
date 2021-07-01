package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GenerateAStringWithCharactersThatHaveOddCountsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "aaab",
                new GenerateAStringWithCharactersThatHaveOddCounts(4).solution()
        );
    }

}
